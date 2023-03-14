package com.etu.familyFinanceService

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
class Test1 {


    @Test
    fun test() {
        val date = Date(0)
        assert(formatDate(date) == "01 January 1970")

    }
}