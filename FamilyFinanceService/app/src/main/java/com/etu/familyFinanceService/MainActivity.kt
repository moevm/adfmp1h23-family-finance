package com.etu.familyFinanceService

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.familyfinanceservice.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("FamilyFinanceService")

        val statisticButton = findViewById<ImageButton>(R.id.statisticButton)
        statisticButton.setOnClickListener {
            val Intent = Intent(this, StatisticScreen::class.java)
            startActivity(Intent)
        }

        val incomeButton = findViewById<Button>(R.id.incomeButton)
        incomeButton.setOnClickListener {
            val Intent = Intent(this, IncomeScreen::class.java)
            startActivity(Intent)
        }

        val expensesButton = findViewById<Button>(R.id.expensesButton)
        expensesButton.setOnClickListener {
            val Intent = Intent(this, ExpensesScreen::class.java)
            startActivity(Intent)
        }

        val aboutButton = findViewById<Button>(R.id.aboutButton)
        aboutButton.setOnClickListener {
            val Intent = Intent(this, AboutScreen::class.java)
            startActivity(Intent)
        }

    }
}

