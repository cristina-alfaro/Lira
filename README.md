# 📱 Lira – Aplicación Demo (Versión Básica)

Esta es una versión **demo** de la aplicación **Lira**, una herramienta diseñada para facilitar la comunicación entre personas oyentes y no oyentes mediante traducción asistida por inteligencia artificial.

---

## 🔐 Credenciales de Acceso

Para acceder a la aplicación, puedes utilizar las siguientes credenciales de prueba:

* **Usuario:** `1`
* **Contraseña:** `1`

---

## 🏠 Menú Principal

Al iniciar sesión, serás recibido con un saludo personalizado. Desde esta pantalla podrás acceder a las dos funcionalidades principales de la app:

1. **Traductor para Personas No Oyentes**
2. **Traductor para Personas Oyentes**

---

## 🤟 Traductor para Personas No Oyentes

Esta funcionalidad simula el uso de inteligencia artificial mediante la cámara del dispositivo.
En la **versión APK para Android**, al ingresar a esta pantalla:

* Se activa una espera de aproximadamente **10 segundos**, simulando el tiempo que una persona tarda en realizar un gesto con las manos.
* Luego, el sistema "interpreta" automáticamente la seña y muestra una traducción.
* En esta demo, la palabra traducida por defecto es **"Hola"**.

---

## 🗣️ Traductor para Personas Oyentes

Esta funcionalidad está orientada a usuarios oyentes que desean comunicar frases a través de señas.

* Utiliza **GIFs animados** de un avatar 3D para mostrar palabras o frases comunes como **"Buenas tardes"**.
* Si la palabra introducida **no está disponible**, se mostrará una imagen por defecto (ej. un paisaje) indicando que aún no se ha implementado la seña correspondiente.

---

## 📥 Instrucciones para abrir la APK en tu Dispositivo Android

🧰 Requisitos previos
Tener Android Studio instalado en tu PC.

Tener habilitado el Modo Desarrollador en tu celular.

Estar conectado a la misma red Wi-Fi tanto en el celular como en la computadora.

Android 11 o superior (recomendado para soporte completo de wireless debugging).

🔧 Paso a paso
1. Activar opciones de desarrollador
En tu celular, ve a:
Ajustes > Acerca del teléfono > Número de compilación

Toca varias veces hasta que diga:
"Ahora eres un desarrollador"

2. Activar Depuración por Wi-Fi
Ve a:
Ajustes > Sistema > Opciones de desarrollador

Activa:

Depuración USB

Depuración inalámbrica (Wireless Debugging)

3. Conectar tu celular desde Android Studio
Abre Android Studio y ve a:
View > Tool Windows > Device Manager

En la parte superior, haz clic en "Pair using Wi-Fi" o "Pair device using pairing code".

En tu celular, aparecerá una dirección IP + código QR o código de emparejamiento.

En Android Studio, introduce esos datos para emparejar.

4. Instalar y abrir la app
Abre el proyecto de Lira o una ventana de terminal (si solo tienes la APK).

✅ ¡Listo!
La aplicación Lira se abrirá en tu celular sin necesidad de un cable USB.
Es una opción ideal para hacer pruebas en tiempo real mientras desarrollas o haces demostraciones.

> ⚠️ *Esta es una versión demo con funciones limitadas. No se encuentra disponible en Google Play Store.*

---

## ⚠️ Nota Importante

Esta demo tiene fines **demostrativos** y **educativos**, por lo que algunas funciones están simuladas y no representan el comportamiento final de la aplicación completa.
