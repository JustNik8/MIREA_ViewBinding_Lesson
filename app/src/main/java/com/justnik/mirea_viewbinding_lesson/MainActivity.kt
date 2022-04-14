package com.justnik.mirea_viewbinding_lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.justnik.mirea_viewbinding_lesson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding: ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setClickListener()
    }

    private fun setClickListener(){
        binding.bOpenActivity.setOnClickListener {
            val intent = Intent(this@MainActivity, ExampleActivity::class.java)
            startActivity(intent)
        }
    }
}