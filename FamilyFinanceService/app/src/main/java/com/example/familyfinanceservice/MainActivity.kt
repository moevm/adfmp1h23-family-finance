package com.example.familyfinanceservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("FamilyFinanceService")

        val incomeButton = findViewById<Button>(R.id.incomeButton)
        incomeButton.setOnClickListener {
            val Intent = Intent(this, IncomeScreen::class.java)
            startActivity(Intent)
        }
    }
}

