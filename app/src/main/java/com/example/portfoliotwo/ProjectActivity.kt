package com.example.portfoliotwo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.portfoliotwo.databinding.ActivityProjectBinding


class ProjectActivity : AppCompatActivity() {

    lateinit var binding: ActivityProjectBinding
    val projectList = listOf(

        Project("Portfolio", "https://github.com/Freznas/PortfolioTwo.git", R.drawable.kodsnutt_portfolio),
        Project("NotePad", "https://github.com/Freznas/NotePad.git",R.drawable.notepad_exempel),
        Project("Giuseppe's trattoria", "https://github.com/Freznas/Restaurant_Menu.git", R.drawable.trattoria_exempel),
        Project("Furious Criminal's Kalkylator", "https://github.com/Freznas/furious_criminals_kalkylator.git",R.drawable.grupp_kalkylator),

        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView: RecyclerView = binding.rvProjectlist
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = layoutManager

        val adapter = ProjectAdapter(projectList) { project ->
            Toast.makeText(
                this, "Clicked on item: ${project.name}",
                Toast.LENGTH_SHORT
            ).show()
        }
        recyclerView.adapter = adapter

    }
}
