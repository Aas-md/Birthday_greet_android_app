package com.example.birthdaygreed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // progress is temp

    }

    fun createBirthDayCard(view: View) {
        val  name = nameInput.editableText.toString()
        val intent = Intent(this,BirthdayGreetingActivity :: class.java)
        intent.putExtra(BirthdayGreetingActivity.name_extra,name)
        startActivity(intent)

    }





}