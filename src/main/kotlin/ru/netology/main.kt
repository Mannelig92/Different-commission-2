package ru.netology

fun main() {
    val transferAmount = 500_000   //сумма перевода
    val typeOfCard = "Mastercard"
    val amountOfPreviousTransfers = 7_600_000   //Сумма предыдущих переводов в этом месяце
    println(whichCard(typeOfCard, transferAmount, amountOfPreviousTransfers))
}

fun whichCard(typeOfCard: String, transferAmount: Int, amountOfPreviousTransfers: Int): String {
    return when (typeOfCard) {
        "Mastercard", "Maestro" -> masterCardAndMaestro(transferAmount, amountOfPreviousTransfers)
        "Visa", "Mir" -> visaAndMir(transferAmount)
        "VK pay" -> "Сумма перевода  $transferAmount копеек"
        else -> "Такая карта не принимается"
    }
}

fun masterCardAndMaestro(transferAmount: Int, amountOfPreviousTransfers: Int): String {
    return when {
        amountOfPreviousTransfers > 7_500_000 -> {
            var amountAfterCommission = transferAmount - (transferAmount * 0.006)
            amountAfterCommission -= 2000.0    //минус 20 рублей, возможно не так понял задание
            "Сумма перевода ${amountAfterCommission.toInt()} копеек"
        }
        else -> "Сумма перевода $transferAmount копеек"
    }
}

fun visaAndMir(transferAmount: Int): String {
    return when {
        transferAmount > 3500 -> {
            val amountAfterCommission = transferAmount - (transferAmount * 0.0075)
            "Сумма перевода ${amountAfterCommission.toInt()} копеек"
        }
        else -> "Сумма перевода недостаточна"
    }
}