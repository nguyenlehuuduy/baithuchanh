package com.example.app_lab2

import RecyclerViewMain.Music
import RecyclerViewMain.MusicAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app_lab2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.recyclerview) {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = MusicAdapter(Musics)
            print("aaaaa $Musics")
        }

        binding.buttonItem.setOnClickListener {
            val intent = Intent(this@MainActivity, Recyclerview::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        binding.recyclerview.adapter?.notifyDataSetChanged()
        print("aaaaa $Musics")
    }

    companion object {
        val Musics = mutableListOf<Music>()

    }
}