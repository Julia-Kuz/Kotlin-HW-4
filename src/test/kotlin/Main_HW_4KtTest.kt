import org.junit.Test

import org.junit.Assert.*

class MainHW4KtTest {

    @Test
    fun fee1CheckForMaestroMasterCardMonth() {
        val card = "MasterCard"
        val sumMonth = 0
        val sumTransfer = 50000

        val result = fee1(card, sumMonth, sumTransfer)
        assertEquals("Превышен лимит перевода", result)
    }
    @Test
    fun fee1CheckForMaestroMasterCardOnce() {
        val card = "Maestro"
        val sumMonth = 0
        val sumTransfer = 150000

        val result = fee1(card, sumMonth, sumTransfer)
        assertEquals("Превышен лимит перевода", result)
    }
    @Test
    fun fee1CheckForMaestroMasterCardMonthSumLimit() {
        val card = "MasterCard"
        val sumMonth = 2
        val sumTransfer = 70000

        val result = fee1(card, sumMonth, sumTransfer)
        assertEquals("Комиссия составляет (руб.): 0.0", result)
    }
    @Test
    fun fee1CheckForMaestroMasterCardMonthSumLimit2() {
        val card = "Maestro"
        val sumMonth = 2
        val sumTransfer = 80000

        val result = fee1(card, sumMonth, sumTransfer)
        assertEquals("Комиссия составляет (руб.): 48.020", result)
    }

    @Test
    fun fee1CheckforVisaMirMonth() {
        val card = "Мир"
        val sumMonth = 0
        val sumTransfer = 650000

        val result = fee1(card, sumMonth, sumTransfer)
        assertEquals( "Превышен лимит перевода", result)
    }
    @Test
    fun fee1CheckforVisaMirOnce() {
        val card = "Visa"
        val sumMonth = 0
        val sumTransfer = 150000

        val result = fee1(card, sumMonth, sumTransfer)
        assertEquals( "Превышен лимит перевода", result)
    }
    @Test
    fun fee1CheckforVisaMirMinFee() {
        val card = "Мир"
        val sumMonth = 0
        val sumTransfer = 50000

        val result = fee1(card, sumMonth, sumTransfer)
        assertEquals( "Комиссия составляет (руб.): 375.0", result)
    }
    @Test
    fun fee1CheckforVisaMirMinFee2() {
        val card = "Visa"
        val sumMonth = 0
        val sumTransfer = 500

        val result = fee1(card, sumMonth, sumTransfer)
        assertEquals( "Комиссия составляет (руб.): 35.0", result)
    }

    @Test
    fun fee1CheckforVKPay() {
        val card = "VK Pay"
        val sumMonth = 0
        val sumTransfer = 25000

        val result = fee1(card, sumMonth, sumTransfer)
        assertEquals( "Превышен лимит перевода", result)
    }
    @Test
    fun fee1CheckforVKPay2() {
        val card = "VK Pay"
        val sumMonth = 0
        val sumTransfer = 45000

        val result = fee1(card, sumMonth, sumTransfer)
        assertEquals( "Превышен лимит перевода", result)
    }
    @Test
    fun fee1CheckforVKPay3() {
        val card = "VK Pay"
        val sumMonth = 0
        val sumTransfer = 5000

        val result = fee1(card, sumMonth, sumTransfer)
        assertEquals( "Комиссия составляет (руб.): 0.0", result)
    }


}