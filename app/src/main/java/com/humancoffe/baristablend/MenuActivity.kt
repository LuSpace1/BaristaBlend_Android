package com.humancoffe.baristablend

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MenuActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //logica boton conf
        val btnConf = findViewById<MaterialButton>(R.id.btnConf)
        btnConf.setOnClickListener { navConf() }
        //logica boton home
        val btnCoffe = findViewById<MaterialButton>(R.id.btnCoffeeMenu)
        btnCoffe.setOnClickListener { navCoffee() }
        //Logica boton User
        val btnUser = findViewById<MaterialButton>(R.id.btnUserMenu)
        btnUser.setOnClickListener { navUser() }

        val btnFavorito = findViewById<MaterialButton>(R.id.btnFavoritos)
        btnFavorito.setOnClickListener { navFavoritos() }

        //logica Cardview de metodos de cafe
        val botones = listOf(
            R.id.cvFrenchPress,
            R.id.cvChemex,
            R.id.cvV60,
            R.id.cvKalita,
            R.id.cvAeropress,
            R.id.cvOrigami,
            R.id.cvDripper,
            R.id.cvSwitch
        )
        botones.forEach { id ->
            findViewById<CardView>(id).setOnClickListener { navViewRecetas() }
        }


    }



    private fun navConf() {
        val intent = Intent(this, PanelConfiguracionActivity::class.java)
        startActivity(intent)
    }
    private fun navCoffee() {
        val intent = Intent(this, CafesActivity::class.java)
        startActivity(intent)
    }
    private fun navUser() {
        val intent = Intent(this, UserActivity::class.java)
        startActivity(intent)
    }

    private fun navFavoritos() {
        val intent = Intent(this, RecetasActivity::class.java)
        startActivity(intent)
    }

    private fun navViewRecetas() {
        val intent = Intent(this, ViewRecetasActivity::class.java)
        startActivity(intent)
    }
}

