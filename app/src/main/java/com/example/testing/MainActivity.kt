package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    /** Called when the user touches the button */
    fun enterButtonClicked(view: View) {
        var text:EditText = findViewById(R.id.editText);
        Log.d("Testing", text.text.toString())
    }




}