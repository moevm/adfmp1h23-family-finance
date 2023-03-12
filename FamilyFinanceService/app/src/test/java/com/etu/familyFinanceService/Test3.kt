package com.etu.familyFinanceService

import com.etu.classes.ExpensesList
import com.etu.classes.IncomesList
import com.etu.utils.formatDate
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import java.util.*


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(MockitoJUnitRunner::class)
class Test3 {


    @Test
    fun test() {
        val expenses: ExpensesList = ExpensesList();
        expenses.addIncome("test", 100)
        expenses.addIncome("testtest", 100)
        assert(expenses.expenses.get(0).first == "test")
        assert(expenses.expenses.get(0).second == 100)
        expenses.editIncome(0, "asdasd", 20)
        assert(expenses.expenses.get(0).first == "asdasd")
        assert(expenses.expenses.get(0).second == 20)

    }
}