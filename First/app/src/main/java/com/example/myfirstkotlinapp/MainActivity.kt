package com.example.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity(), TextWatcher {
    private var editName: EditText? = null
    private var editAge: EditText? = null

    private var name: String? = null
    private var age = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editName = findViewById<EditText>(R.id.editText_name)
        editAge = findViewById<EditText>(R.id.editText_age)

        editName?.addTextChangedListener(this)
        editAge?.addTextChangedListener(this)
    }

    override fun afterTextChanged(p0: Editable?) {
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        Toast.makeText(this, p0.toString(), Toast.LENGTH_SHORT).show()
    }
}
