package com.example.myviewmodelsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Criando um ViewModel
        val viewModel: MyViewModel by viewModels { MyViewModel.Factory }


        val textViewCounter = findViewById<TextView>(R.id.text_view_counter)
        val buttonContar = findViewById<Button>(R.id.button_contar)

        textViewCounter.text = viewModel.getCount().toString()
        buttonContar.setOnClickListener {
            viewModel.incrementOne()
            textViewCounter.text = viewModel.getCount().toString()
        }
    }
}