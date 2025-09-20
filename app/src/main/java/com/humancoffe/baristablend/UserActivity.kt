package com.humancoffe.baristablend

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //logica boton Coffe
        val btnCoffee = findViewById<ImageButton>(R.id.btnCoffeeMenu)
        btnCoffee.setOnClickListener { navCafes() }
        //logica boton home
        val btnHome = findViewById<ImageButton>(R.id.btnHomeMenu)
        btnHome.setOnClickListener { navHome() }
        //Logica boton cerrar sesion
        val btnExit = findViewById<Button>(R.id.btnexit)
        btnExit.setOnClickListener { navExit() }
        //Logica boton back
        val btnback = findViewById<ImageButton>(R.id.btnBack)
        btnback.setOnClickListener { finish() }
        //Logica boton configuracion
        val btnConf = findViewById<ImageButton>(R.id.btnConf)
        btnConf.setOnClickListener { navConf() }
    }

    private fun navCafes() {
        val intent = Intent(this, CafesActivity::class.java)
        startActivity(intent)
    }
    private fun navHome() {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
    private fun navExit() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    private fun navConf() {
        val intent = Intent(this, PanelConfiguracionActivity::class.java)
        startActivity(intent)
    }
}