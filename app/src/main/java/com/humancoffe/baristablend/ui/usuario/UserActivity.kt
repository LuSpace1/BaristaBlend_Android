package com.humancoffe.baristablend.ui.usuario

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.humancoffe.baristablend.R
import com.humancoffe.baristablend.ui.auth.LoginActivity
import com.humancoffe.baristablend.ui.cafes.CafesActivity
import com.humancoffe.baristablend.ui.menu.MenuActivity

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
        val btnCoffee = findViewById<MaterialButton>(R.id.btnCoffeeMenu)
        btnCoffee.setOnClickListener { navCafes() }
        //logica boton home
        val btnHome = findViewById<MaterialButton>(R.id.btnHomeMenu)
        btnHome.setOnClickListener { navHome() }
        //Logica boton cerrar sesion
        val btnExit = findViewById<MaterialButton>(R.id.btnexit)
        btnExit.setOnClickListener { navExit() }
        //Logica boton back
        val btnback = findViewById<MaterialButton>(R.id.btnBackCoffe)
        btnback.setOnClickListener { finish() }
        //Logica boton configuracion
        val btnConf = findViewById<MaterialButton>(R.id.btnConf)
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