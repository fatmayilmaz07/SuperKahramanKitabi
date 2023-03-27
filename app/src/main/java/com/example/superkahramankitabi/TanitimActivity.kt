package com.example.superkahramankitabi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.superkahramankitabi.databinding.ActivityTanitimBinding

class TanitimActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTanitimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tanitim)

        val intent = intent
        val secilenKahramanIsmi = intent.getStringExtra("superKahramanIsmi")
        binding.textView.text = secilenKahramanIsmi

        val secilenKahramanGorseli = intent.getIntExtra("superKahramanGorseli", 0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources, secilenKahramanGorseli)
        binding.imageView.setImageBitmap(bitmap)

    }
}