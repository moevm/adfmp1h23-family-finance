package com.etu.familyFinanceService

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.etu.familyFinanceService.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class IncomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_income_screen)
        setTitle("Доходы")

        val addIncomeButton = findViewById<FloatingActionButton>(R.id.addIncomeButton)
        addIncomeButton.setOnClickListener {
            val Intent = Intent(this, AddIncomeScreen::class.java)
            startActivity(Intent)
        }
    }
}