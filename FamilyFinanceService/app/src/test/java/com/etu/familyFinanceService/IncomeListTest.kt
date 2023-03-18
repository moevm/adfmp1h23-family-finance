package com.etu.familyFinanceService

import com.etu.classes.IncomesList
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class IncomeListTest {

    @Test
    fun mainMethodsTest() {
        val incomes: IncomesList = IncomesList();
        incomes.addIncome("test", 100)
        incomes.addIncome("testtest", 100)
        assert(incomes.incomes.get(0).first == "test")
        assert(incomes.incomes.get(0).second == 100)
        incomes.editIncome(0, "asdasd", 20)
        assert(incomes.incomes.get(0).first == "asdasd")
        assert(incomes.incomes.get(0).second == 20)
        incomes.deleteIncome(0)
        assert(incomes.incomes.size == 1)
        assert(incomes.incomes.get(0).first == "testtest")
        assert(incomes.incomes.get(0).second == 100)
        incomes.deleteIncome(0)
        assert(incomes.incomes.size == 0)

    }
}