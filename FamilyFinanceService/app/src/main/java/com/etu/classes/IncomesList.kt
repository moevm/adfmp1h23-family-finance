package com.etu.classes

class IncomesList {
    public var incomes: MutableList<Pair<String, Int>> = mutableListOf();

    fun addIncome(name: String, count: Int){
        incomes.add(Pair<String, Int>(name, count));
    }

    fun editIncome(index: Int, name: String, count: Int){
        incomes.set(index, Pair<String, Int>(name, count));
    }

    fun deleteIncome(index: Int){
        incomes.removeAt(index);
    }

}