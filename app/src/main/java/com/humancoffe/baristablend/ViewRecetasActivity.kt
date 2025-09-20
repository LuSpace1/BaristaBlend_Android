package com.humancoffe.baristablend

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ViewRecetasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_view_recetas)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //logica boton coffe
        val btnCoffe = findViewById<ImageButton>(R.id.btnCoffeeMenu)
        btnCoffe.setOnClickListener { navCoffe() }
        //logica boton conf
        val btnConf = findViewById<ImageButton>(R.id.btnConf)
        btnConf.setOnClickListener { navConf() }
        //logica boton home
        val btnHome = findViewById<ImageButton>(R.id.btnHomeMenu)
        btnHome.setOnClickListener { navHome() }
        //Logica boton User
        val btnUser = findViewById<ImageButton>(R.id.btnUserMenu)
        btnUser.setOnClickListener { navUser() }
        //logica boton devolver
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()

        }
    }

    private fun navConf() {
        val intent = Intent(this, PanelConfiguracionActivity::class.java)
        startActivity(intent)
    }
    private fun navHome() {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
    private fun navUser() {
        val intent = Intent(this, UserActivity::class.java)
        startActivity(intent)
    }
    private fun navCoffe(){
        val intent = Intent(this, CafesActivity::class.java)
        startActivity(intent)
    }
}