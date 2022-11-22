package com.hemonugi.currency_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hemonugi.currency_converter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var expressionString = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners(binding)
    }

    private fun setListeners(binding: ActivityMainBinding) {
        val buttons = listOf(binding.numZero,
            binding.numOne,
            binding.numTwo,
            binding.numThree,
            binding.numFour,
            binding.numFive,
            binding.numSix,
            binding.numSeven,
            binding.numEight,
            binding.numNine,
        )

        buttons.forEach { button -> button.setOnClickListener {
                expressionString += button.text
                binding.expInput.text = expressionString
            }
        }
    }
}