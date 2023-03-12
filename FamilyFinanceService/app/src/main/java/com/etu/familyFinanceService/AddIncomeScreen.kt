package com.etu.familyFinanceService

import com.etu.utils.formatDate
import android.app.AlertDialog
import android.app.DatePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.etu.familyFinanceService.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

import java.util.*

class AddIncomeScreen() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_income_screen)
        setTitle("Добавить доход")

        val addCategoryButton = findViewById<FloatingActionButton>(R.id.addCategoryButton)
        addCategoryButton.setOnClickListener {
            showAddCategoryDialog()
        }

        val removeCategoryButton = findViewById<FloatingActionButton>(R.id.removeCategoryButton)
        removeCategoryButton.setOnClickListener {
            showRemoveCategoryDialog()
        }


    }

    fun showAddCategoryDialog(){
        val builder: AlertDialog.Builder = android.app.AlertDialog.Builder(this)
        builder.setTitle("Add category")

        val input = EditText(this)
        input.setHint("Category name...")
        input.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(input)

        builder.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
            var m_Text = input.text.toString()
        })
        builder.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })

        builder.show()
    }

    fun showRemoveCategoryDialog(){
        val builder: AlertDialog.Builder = android.app.AlertDialog.Builder(this)
        builder.setTitle("Remove category")

        var message = TextView(this)
        message.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)
        message.setText("Are you sure that you want remove this category?")

        builder.setView(message)

        builder.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which-> })
        builder.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })

        builder.show()
    }

    fun openDatePicker(view: View){
        val getDate = Calendar.getInstance()
        val datePicker = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{ datePicker, i, i2, i3 ->
            val selectDate = Calendar.getInstance()
            selectDate.set(Calendar.YEAR, i)
            selectDate.set(Calendar.MONTH, i2)
            selectDate.set(Calendar.DAY_OF_MONTH, i3)
            val date = formatDate(selectDate.time)
            Toast.makeText(this, "Date: " + date, Toast.LENGTH_SHORT).show()
            val datePickerButton = findViewById<Button>(R.id.datePickerButton)
            datePickerButton.text = date
        }, getDate.get(Calendar.YEAR), getDate.get(Calendar.MONTH), getDate.get(Calendar.DAY_OF_MONTH))
        datePicker.show()
    }


}