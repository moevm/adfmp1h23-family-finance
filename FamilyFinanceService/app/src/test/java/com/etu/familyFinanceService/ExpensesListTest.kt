package com.etu.familyFinanceService

import com.etu.classes.ExpensesList
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExpensesListTest {


    @Test
    fun mainMethodsTest() {
        val expenses: ExpensesList = ExpensesList();
        expenses.addExpense("test", 100)
        expenses.addExpense("testtest", 100)
        assert(expenses.expenses.get(0).first == "test")
        assert(expenses.expenses.get(0).second == 100)
        expenses.editExpense(0, "asdasd", 20)
        assert(expenses.expenses.get(0).first == "asdasd")
        assert(expenses.expenses.get(0).second == 20)
        expenses.deleteExpense(0)
        assert(expenses.expenses.size == 1)
        assert(expenses.expenses.get(0).first == "testtest")
        assert(expenses.expenses.get(0).second == 100)
        expenses.deleteExpense(0)
        assert(expenses.expenses.size == 0)

    }
}