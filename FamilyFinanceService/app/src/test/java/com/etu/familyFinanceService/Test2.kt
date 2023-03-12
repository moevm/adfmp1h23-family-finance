package com.etu.familyFinanceService

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
class Test2 {


    @Test
    fun test() {
        val incomes: IncomesList = IncomesList();
        incomes.addIncome("test", 100)
        incomes.addIncome("testtest", 100)
        assert(incomes.incomes.get(0).first == "test")
        assert(incomes.incomes.get(0).second == 100)
        incomes.editIncome(0, "asdasd", 20)
        assert(incomes.incomes.get(0).first == "asdasd")
        assert(incomes.incomes.get(0).second == 20)
    }
}