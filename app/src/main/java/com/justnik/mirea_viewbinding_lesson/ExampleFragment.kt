package com.justnik.mirea_viewbinding_lesson

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.justnik.mirea_viewbinding_lesson.databinding.FragmentExampleBinding

class ExampleFragment : Fragment(R.layout.fragment_example) {
    private val binding: FragmentExampleBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setClickListener()
    }

    private fun setClickListener() {
        with(binding) {
            bExample.setOnClickListener {
                val text = etExample.text.toString()
                if(text.isEmpty()){
                    etExample.error = "Пустое поле"
                }
                else{
                    tvExample.text = text
                }
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(): ExampleFragment {
            val fragment = ExampleFragment()

            //Здесь вы можете создать Bundle и добавить его во фрагмент

            return fragment
        }
    }
}