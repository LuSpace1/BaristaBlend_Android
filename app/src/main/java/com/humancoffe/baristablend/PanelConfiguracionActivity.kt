package com.humancoffe.baristablend

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.switchmaterial.SwitchMaterial
import com.google.android.material.textview.MaterialTextView

class PanelConfiguracionActivity : AppCompatActivity() {

    private lateinit var textViewSwitch: MaterialTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_panel_configuracion)
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
        //Logica boton back
        val btnback = findViewById<MaterialButton>(R.id.btnBackCoffe)
        btnback.setOnClickListener { finish() }
        //Logica boton User
        val btnUser = findViewById<MaterialButton>(R.id.btnUserMenu)
        btnUser.setOnClickListener { navUser() }
        //logica botonSwitch
        textViewSwitch = findViewById(R.id.tvSwitch)

        val btnSwitch = findViewById<SwitchMaterial>(R.id.swButton)
        btnSwitch.setOnCheckedChangeListener { _, isChecked ->
            cambioSwitch(isChecked)
        }

    }

    private fun navCafes() {
        val intent = Intent(this, CafesActivity::class.java)
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

    private fun cambioSwitch(isChecked: Boolean) {
        textViewSwitch.text = if (isChecked) "On" else "Off"
        textViewSwitch.setTextColor(
            if (isChecked) getColor(R.color.md_theme_scrim)
            else getColor(R.color.md_theme_error)
        )
    }
}

