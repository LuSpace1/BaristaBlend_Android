package com.humancoffe.baristablend

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // 1) Instala la API de Splash (compatibilidad hasta Android 6.0)
        val splash = installSplashScreen()

        super.onCreate(savedInstanceState)

        // 2) (Opcional) Mantener un instante el splash (mientras haces cargas MUY ligeras)
        var listo = false
        splash.setKeepOnScreenCondition { !listo }
        Handler(Looper.getMainLooper()).postDelayed({
            listo = true
        }, 500) // ~0.5 s para que se luzca el logo sin demorar

        // 3) Carga tu UI normal basada en XML
        setContentView(R.layout.activity_main)

        // 4) Aquí ya puedes inicializar vistas, viewmodels, etc.
    }
}

