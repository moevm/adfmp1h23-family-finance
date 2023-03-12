package com.etu.familyFinanceService

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.etu.familyFinanceService.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ExpensesScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expenses_screen)
        setTitle("Расходы")



        val addExpensesButton = findViewById<FloatingActionButton>(R.id.addExpensesButton)
        addExpensesButton.setOnClickListener {
            val Intent = Intent(this, AddExpensesScreen::class.java)
            startActivity(Intent)
        }
    }
}