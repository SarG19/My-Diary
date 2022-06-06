package com.example.mydiary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_entry.*
import kotlinx.android.synthetic.main.activity_main.*

class addEntryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_entry)

        doneButton.setOnClickListener {startActivity(Intent(this, MainActivity::class.java))}
    }
}