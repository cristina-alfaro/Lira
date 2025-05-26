package com.example.primeraaplicacion.firstApp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.primeraaplicacion.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnStart = findViewById<AppCompatButton>(R.id.btnTouch)
        val btnCancel = findViewById<AppCompatButton>(R.id.btnClear)
        val etName = findViewById<AppCompatEditText>(R.id.etName)
        val etPass= findViewById<AppCompatEditText>(R.id.etPass)
        val errorPass = findViewById<TextView>(R.id.errorPass)

        btnCancel.setOnClickListener{
            etName.setText("")
            etPass.setText("")
        }

        btnStart.setOnClickListener {
            val user = etName.text.toString()
            val pass = etPass.text.toString()

            if (user.isNotEmpty() && pass.isNotEmpty())
            {
                if((user.uppercase() == "LIRAUSER" && pass.uppercase() == "PASSWORD") || (user.uppercase() == "1" && pass.uppercase() == "1"))
                {
                    val intent = Intent(this, MenuActivity::class.java)
                    startActivity(intent)
                }
                else
                {
                    etName.setTextColor(Color.RED)
                    errorPass.setText("Error al iniciar sesion valide usuario y/o contraseña")
                    val shake: Animation = AnimationUtils.loadAnimation(
                        applicationContext,
                        R.anim.shake
                    )
                    etName.startAnimation(shake)
                    GlobalScope.launch {
                        delay(1000)
                        withContext(Dispatchers.Main){
                            etName.setTextColor(Color.BLACK)
                        }
                    }
                }
            }
        }
    }
}