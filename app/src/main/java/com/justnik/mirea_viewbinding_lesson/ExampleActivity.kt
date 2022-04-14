package com.justnik.mirea_viewbinding_lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.justnik.mirea_viewbinding_lesson.databinding.ActivityExampleBinding

class ExampleActivity : AppCompatActivity(R.layout.activity_example) {

    private val binding: ActivityExampleBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        launchExampleFragment()
    }

    private fun launchExampleFragment(){
        val fragment = ExampleFragment.newInstance()

        supportFragmentManager.beginTransaction()
            .replace(R.id.example_container, fragment)
            .commit()
    }
}