package com.humancoffe.baristablend.ui.recetas

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.humancoffe.baristablend.R
import com.humancoffe.baristablend.ui.cafes.CafesActivity
import com.humancoffe.baristablend.ui.menu.MenuActivity
import com.humancoffe.baristablend.ui.usuario.PanelConfiguracionActivity
import com.humancoffe.baristablend.ui.usuario.UserActivity

class RecetasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recetas)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //logica boton coffe
        val btnCoffe = findViewById<MaterialButton>(R.id.btnCoffeeMenu)
        btnCoffe.setOnClickListener { navCoffe() }
        //logica boton conf
        val btnConf = findViewById<MaterialButton>(R.id.btnConf)
        btnConf.setOnClickListener { navConf() }
        //logica boton home
        val btnHome = findViewById<MaterialButton>(R.id.btnHomeMenu)
        btnHome.setOnClickListener { navHome() }
        //Logica boton User
        val btnUser = findViewById<MaterialButton>(R.id.btnUserMenu)
        btnUser.setOnClickListener { navUser() }
        //logica boton devolver
        val btnBack = findViewById<MaterialButton>(R.id.btnBack)
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