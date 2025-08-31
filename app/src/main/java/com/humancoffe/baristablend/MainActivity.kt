package com.humancoffe.baristablend

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // 1) Instalamos la API de Splash
        val splash = installSplashScreen()

        super.onCreate(savedInstanceState)

        // 2) (Opcional) Mantener un instante el splash (mientras haces cargas MUY ligeras)
        var listo = false
        splash.setKeepOnScreenCondition { !listo }
        Handler(Looper.getMainLooper()).postDelayed({
            listo = true
        }, 1000) // Tiempo en milisegundos

        // 3) Carga tu UI normal basada en XML
        setContentView(R.layout.activity_login)
    }
}

