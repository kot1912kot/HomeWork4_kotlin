import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun commissionVisa() {
        val typeCard = "Visa"
        val amountThisMounth = 3000
        val transferAmount = 15_000

        val result = commission(typeCard, amountThisMounth, transferAmount)

        Assert.assertEquals(112500, result)
    }
    @Test
    fun commissionVkPay() {
        val typeCard = "Vk Pay"
        val amountThisMounth = 3000
        val transferAmount = 15_000

        val result = commission(typeCard, amountThisMounth, transferAmount)

        Assert.assertEquals(0, result)
    }

    @Test
    fun commissionMaestro() {
        val typeCard = "Maestro"
        val amountThisMounth = 3000
        val transferAmount = 15_000

        val result = commission(typeCard, amountThisMounth, transferAmount)

        Assert.assertEquals(0, result)
    }

    @Test
    fun commission() {
        val typeCard = "Union"
        val amountThisMounth = 3000
        val transferAmount = 15_000

        val result = commission(typeCard, amountThisMounth, transferAmount)

        Assert.assertEquals(0, result)
    }

    @Test
    fun commissionMir() {
        val typeCard = "Мир"
        val amountThisMounth = 3000
        val transferAmount = 15_000

        val result = commission(typeCard, amountThisMounth, transferAmount)

        Assert.assertEquals(0, result)
    }

    @Test
    fun commissionMastercard() {
        val typeCard = "Mastercard"
        val amountThisMounth = 3000
        val transferAmount = 15_000

        val result = commission(typeCard, amountThisMounth, transferAmount)

        Assert.assertEquals(0, result)
    }
}
