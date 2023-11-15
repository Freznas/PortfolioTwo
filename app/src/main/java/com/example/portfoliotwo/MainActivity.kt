package com.example.portfoliotwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var projectButton: Button
    private lateinit var profileButton: Button
    private lateinit var artButton: Button
    private lateinit var socialButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        projectButton = findViewById(R.id.btn_project)

        projectButton.setOnClickListener {
            val intent = Intent(this, ProjectActivity::class.java)
            startActivity(intent)
        }

        profileButton = findViewById(R.id.btn_profile)

        profileButton.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        artButton = findViewById(R.id.btn_graphic)
        artButton.setOnClickListener {
            val intent = Intent(this, ArtActivity::class.java)
            startActivity(intent)
        }
        socialButton = findViewById(R.id.btn_social)
        socialButton.setOnClickListener {
            val intent = Intent(this, SocialActivity::class.java)
            startActivity(intent)
        }
    }
}
