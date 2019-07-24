package com.example.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), TextWatcher {
    private var editName: EditText? = null
    private var editAge: EditText? = null
    private var textName: TextView? = null
    private var textAge: TextView? = null

    private var name: String? = null
    private var age: Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //editName = findViewById<EditText>(R.id.editText_name)
        //editAge = findViewById<EditText>(R.id.editText_age)

        //textName = findViewById<TextView>(R.id.textView_Name)
        //textAge = findViewById<TextView>(R.id.textView_Age)

        //editName?.addTextChangedListener(this)
        //editAge?.addTextChangedListener(this)

        editText_name?.addTextChangedListener(this)
        editText_age?.addTextChangedListener(this)
    }

    override fun afterTextChanged(p0: Editable?) {
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        //Toast.makeText(this, p0.toString(), Toast.LENGTH_SHORT).show()
        //On old version
        //name = editName?.text.toString()
        //age = Integer.valueOf(editAge?.text.toString())
        //textName?.text = name
        //textAge?.text = age.toString()


        // On new version
        textView_Name?.text = editText_name?.text.toString()
        textView_Age?.text = editText_age?.text.toString()
    }
}
