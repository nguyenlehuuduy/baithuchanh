package com.example.app_lab2

import RecyclerViewMain.Music
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app_lab2.databinding.ActivityMainBinding
import com.example.app_lab2.databinding.ActivityRecyclerviewBinding

class Recyclerview : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val name = binding.plantText1.text.toString()
            val singer = binding.plainText2.text.toString()

            val music = Music(name,singer)

            MainActivity.Musics.add(music)
            finish()

        }
    }
}