import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun whichCard() {
        //arrange
        val amount = 500_000   //сумма перевода
        val card = "Maestro"
        val transfers = 7_600_000

        //act
        val result = ru.netology.whichCard(
            transferAmount = amount,
            typeOfCard = card,
            amountOfPreviousTransfers = transfers
        )
        //assert
        assertEquals("Сумма перевода 495000 копеек", result)
    }

    @Test
    fun masterCardAndMaestro() {
        //arrange
        val amount = 500_000   //сумма перевода
        val card = "Maestro"
        val transfers = 7_600_000

        //act
        val result = ru.netology.whichCard(
            transferAmount = amount,
            typeOfCard = card,
            amountOfPreviousTransfers = transfers
        )
        //assert
        assertEquals("Сумма перевода 495000 копеек", result)
    }

    @Test
    fun visaAndMir() {
        //arrange
        val amount = 500_000   //сумма перевода
        val card = "Maestro"
        val transfers = 7_600_000

        //act
        val result = ru.netology.whichCard(
            transferAmount = amount,
            typeOfCard = card,
            amountOfPreviousTransfers = transfers
        )
        //assert
        assertEquals("Сумма перевода 495000 копеек", result)
    }
}