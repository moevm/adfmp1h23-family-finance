package com.etu.familyFinanceService

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.etu.familyFinanceService.R
import com.etu.utils.formatDate
import java.text.SimpleDateFormat
import java.util.*

class StatisticScreen : AppCompatActivity() {

    var dateFrom: Date = Date()
    var dateTo: Date = Date()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistic_screen)
        setTitle("Статистика")
    }

    fun openDatePickerFrom(view: View) {
        val getDate = Calendar.getInstance()
        val datePicker = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{ datePicker, i, i2, i3 ->
            val selectDate = Calendar.getInstance()
            selectDate.set(Calendar.YEAR, i)
            selectDate.set(Calendar.MONTH, i2)
            selectDate.set(Calendar.DAY_OF_MONTH, i3)
            val date = formatDate(selectDate.time)
            dateFrom = selectDate.time
            Toast.makeText(this, "Date: " + date, Toast.LENGTH_SHORT).show()
            val datePickerButton2 = findViewById<Button>(R.id.datePickerButton2)
            datePickerButton2.text = date
        }, getDate.get(Calendar.YEAR), getDate.get(Calendar.MONTH), getDate.get(Calendar.DAY_OF_MONTH))
        datePicker.show()
    }



    fun openDatePickerTo(view: View) {
        val getDate = Calendar.getInstance()
        val datePicker = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{ datePicker, i, i2, i3 ->
            val selectDate = Calendar.getInstance()
            selectDate.set(Calendar.YEAR, i)
            selectDate.set(Calendar.MONTH, i2)
            selectDate.set(Calendar.DAY_OF_MONTH, i3)
            val date = formatDate(selectDate.time)
            dateTo = selectDate.time
            Toast.makeText(this, "Date: " + date, Toast.LENGTH_SHORT).show()
            val datePickerButton4 = findViewById<Button>(R.id.datePickerButton4)
            datePickerButton4.text = date
        }, getDate.get(Calendar.YEAR), getDate.get(Calendar.MONTH), getDate.get(Calendar.DAY_OF_MONTH))
        datePicker.show()
    }


}