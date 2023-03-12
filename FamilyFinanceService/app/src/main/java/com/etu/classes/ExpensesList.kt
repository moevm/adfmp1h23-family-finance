package com.etu.classes

class ExpensesList {
    public var expenses: MutableList<Pair<String, Int>> = mutableListOf();

    fun addIncome(name: String, count: Int){
        expenses.add(Pair<String, Int>(name, count));
    }

    fun editIncome(index: Int, name: String, count: Int){
        expenses.set(index, Pair<String, Int>(name, count));
    }

    fun deleteIncome(index: Int){
        expenses.removeAt(index);
    }

}