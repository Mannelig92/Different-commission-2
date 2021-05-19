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
    fun masterCardAndMaestro_Maestro() {
        //arrange
        val amount = 500_000   //сумма перевода
        val card = "Maestro"
        val transfers = 7_400_000

        //act
        val result = ru.netology.whichCard(
            transferAmount = amount,
            typeOfCard = card,
            amountOfPreviousTransfers = transfers
        )
        //assert
        assertEquals("Сумма перевода 500000 копеек", result)
    }
    @Test
    fun masterCardAndMaestro_MasterCard() {
        //arrange
        val amount = 500_000   //сумма перевода
        val card = "Mastercard"
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
    fun visaAndMir_Visa() {
        //arrange
        val amount = 500_000   //сумма перевода
        val card = "Visa"
        val transfers = 7_600_000

        //act
        val result = ru.netology.whichCard(
            transferAmount = amount,
            typeOfCard = card,
            amountOfPreviousTransfers = transfers
        )
        //assert
        assertEquals("Сумма перевода 496250 копеек", result)
    }
    @Test
    fun visaAndMir_Mir() {
        //arrange
        val amount = 3000   //сумма перевода
        val card = "Mir"
        val transfers = 7_600_000

        //act
        val result = ru.netology.whichCard(
            transferAmount = amount,
            typeOfCard = card,
            amountOfPreviousTransfers = transfers
        )
        //assert
        assertEquals("Сумма перевода недостаточна", result)
    }
}