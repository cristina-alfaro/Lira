package com.example.primeraaplicacion.firstApp

import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.primeraaplicacion.R

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chat)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnEnviar = findViewById<AppCompatButton>(R.id.btnEnviar)
        btnEnviar.setOnClickListener {
            addTextView()
            addImageView()
        }

    }

    private fun addTextView() {
        val etChat = findViewById<AppCompatEditText>(R.id.etChat)
        val container = findViewById<LinearLayout>(R.id.container)

        val text = etChat.text.toString()

        if (text.isNotEmpty()) {
            val textView = TextView(this)
            textView.text = text

            textView.setTextColor(Color.BLACK)
            val layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            layoutParams.setMargins(20, 10, 0, 5)
            textView.layoutParams = layoutParams
            textView.textSize = 30f
            textView.setBackgroundResource(R.drawable.rounded_background)
            container.addView(textView, 0) // Agrega el TextView al principio del contenedor
        }
    }
    private fun addImageView() {
        val container = findViewById<LinearLayout>(R.id.container)
        val etChat = findViewById<AppCompatEditText>(R.id.etChat)
        val text = etChat.text.toString()

        if (text.isNotEmpty()){
            //Creacion de Imageview para agregar gif con glide
            val imageView = ImageView(this)
            val layoutParamsImageView = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            layoutParamsImageView.setMargins(0, 5, 0, 0)
            imageView.layoutParams = layoutParamsImageView

            when(text.uppercase()){
                "LO SIENTO"->Glide.with(this)
                    .asGif()
                    .load(R.drawable.lo_siento)
                    .into(imageView)
                "BUENAS TARDES"->Glide.with(this)
                    .asGif()
                    .load(R.drawable.buenas_tardes)
                    .into(imageView)
                "BUENAS NOCHES"->Glide.with(this)
                    .asGif()
                    .load(R.drawable.buenas_noches)
                    .into(imageView)
                "LO SIENTO"->Glide.with(this)
                    .asGif()
                    .load(R.drawable.lo_siento)
                    .into(imageView)
                "MAS O MENOS"->Glide.with(this)
                    .asGif()
                    .load(R.drawable.mas_o_menos)
                    .into(imageView)
                else->Glide.with(this)
                    .asGif()
                    .load(R.drawable.beach_waves)
                    .into(imageView)
            }



            container.addView(imageView, 1) // Agrega el ImageView al contenedor
        }

        etChat.text?.clear() // Limpia el campo de texto
    }
}