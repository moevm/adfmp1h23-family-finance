package com.example.familyfinanceservice

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.util.TypedValue
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class AddExpensesScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_expenses_screen)
        setTitle("Добавить расход")

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

// Set up the input
        val input = EditText(this)
// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
        input.setHint("Category name...")
        input.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(input)

// Set up the buttons
        builder.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
            // Here you get get input text from the Edittext
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
}