package com.example.projectuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectuts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.weightPicker.minValue = 30
        binding.weightPicker.maxValue = 150

        binding.heightPicker.minValue = 100
        binding.heightPicker.maxValue = 250

        binding.weightPicker.setOnValueChangedListener{ _,_,_ ->
            calculateBMI()
        }

        binding.weightPicker.setOnValueChangedListener { _,_,_ ->
            calculateBMI()
        }

    }

    private fun calculateBMI()
    {
        val height = binding.heightPicker.value
        val doubleHeight = height.toDouble() / 100

        val weight = binding.weightPicker.value

        val bmi = weight.toDouble() / (doubleHeight * doubleHeight)

        binding.resultsTV.text = String.format("BMI kamu adalah: %.2f\nTeridentifikasi: %s", bmi, helthyMessage(bmi))


    }

    private fun helthyMessage(bmi: Double): String
    {
        if (bmi < 18.5)
            return "Kekurangan berat badan"
        if (bmi < 25.0)
            return "Ideal"
        if (bmi < 30.0)
            return "Kelebihan berat badan"


        return "Obese"
    }

}