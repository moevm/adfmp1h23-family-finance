package com.etu.utils
import java.text.SimpleDateFormat
import java.util.*

fun formatDate(date: Date): String{
    val formatDate = SimpleDateFormat("dd MMMM YYYY", Locale.US);
    return formatDate.format(date);
}