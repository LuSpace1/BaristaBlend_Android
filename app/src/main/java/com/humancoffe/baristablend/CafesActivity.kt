package com.humancoffe.baristablend

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CafesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cafes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //logica boton conf
        val btnConf = findViewById<ImageButton>(R.id.btnConf)
        btnConf.setOnClickListener { navConf() }
        //logica boton home
        val btnHome = findViewById<ImageButton>(R.id.btnHomeMenu)
        btnHome.setOnClickListener { navHome() }
        //Logica boton User
        val btnUser = findViewById<ImageButton>(R.id.btnUserMenu)
        btnUser.setOnClickListener { navUser() }

        val btnBack = findViewById<ImageButton>(R.id.btnBackCoffe)
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
}