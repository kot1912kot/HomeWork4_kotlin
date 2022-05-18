import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun commission() {
        val typeCard = "Visa"
        val amountThisMounth = 3000
        val transferAmount = 15_000

        val result = commission(typeCard, amountThisMounth, transferAmount)

        assertEquals(112500, result)
    }
}