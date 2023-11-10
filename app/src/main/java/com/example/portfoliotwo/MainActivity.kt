package com.example.portfoliotwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var projectButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hitta knappen med dess ID
        projectButton = findViewById(R.id.btn_project)

        // Lägg till en åtgärd när knappen klickas
        projectButton.setOnClickListener {
            // Gör något när knappen klickas
            projectButton.setOnClickListener {
                val intent = Intent(this, ProjectActivity::class.java)
                startActivity(intent)
            }

            Toast.makeText(this, "Knappen klickades!", Toast.LENGTH_SHORT).show()
        }
    }
}