package com.humancoffe.baristablend

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.net.Uri
import android.widget.ImageButton
import com.google.android.material.button.MaterialButton


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener { navHome() }

        val btnGoogle = findViewById<MaterialButton>(R.id.btnGoogle)
        btnGoogle.setOnClickListener { navGoogle() }

        val btnInstagram = findViewById<MaterialButton>(R.id.btnInstagram)
        btnInstagram.setOnClickListener { navInstagram() }

        val btnFacebook = findViewById<MaterialButton>(R.id.btnFacebook)
        btnFacebook.setOnClickListener { navFacebook() }
    }
    //Funcion para navegar MenuActivity
    fun navHome(){
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }

    fun navGoogle(){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://accounts.google.com/v3/signin/identifier?hl=es&ifkv=AfYwgwWLv8E8xCz6bJODQ9tMn9jCMentqcuBKXwQ2bV5d6Hf2BPoaisbH4fHCyVgJllYi_JNtmJE&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S705119325%3A1758341500144806"))
        startActivity(intent)
    }

    fun navInstagram(){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/accounts/login/"))
        startActivity(intent)
    }

    fun navFacebook(){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/login/?locale=es_LA"))
        startActivity(intent)
    }


}