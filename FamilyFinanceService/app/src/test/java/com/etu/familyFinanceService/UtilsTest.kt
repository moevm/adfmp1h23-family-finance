package com.etu.familyFinanceService

import com.etu.utils.formatDate
import org.junit.Test
import java.util.*


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UtilsTest {


    @Test
    fun formatDateTest() {
        val date = Date(0)
        assert(formatDate(date) == "01 January 1970")

    }
}