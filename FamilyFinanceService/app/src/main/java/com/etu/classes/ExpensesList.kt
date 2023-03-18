package com.etu.classes

class ExpensesList {
    public var expenses: MutableList<Pair<String, Int>> = mutableListOf();

    fun addExpense(name: String, count: Int){
        expenses.add(Pair<String, Int>(name, count));
    }

    fun editExpense(index: Int, name: String, count: Int){
        expenses.set(index, Pair<String, Int>(name, count));
    }

    fun deleteExpense(index: Int){
        expenses.removeAt(index);
    }

}