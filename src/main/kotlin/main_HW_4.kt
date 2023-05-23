fun main() {
        // Задача 2
   println(fee1("VK Pay", sumMonth = 50_000, sumTransfer = 2_000))
}

fun fee1(card: String = "VK Pay", sumMonth: Int = 0, sumTransfer: Int): String {
    val minFee = 35.0
    val sumLimit = 75000
    val limitTransferMonth = 600_000
    val limitTransferOnce = 150_000
    val limitTransferMonthVK = 40_000
    val limitTransferOnceVK = 15_000

    return when (card) {
        "MasterCard", "Maestro" ->
            when {
                (sumTransfer + sumMonth) < limitTransferMonth && sumTransfer < limitTransferOnce ->
                    if ((sumTransfer + sumMonth) < sumLimit) "Комиссия составляет (руб.): " + 0.0 else "Комиссия составляет (руб.): " + sumTransfer * 0.06 / 100 + 20

                else -> "Превышен лимит перевода"
            }

        "Visa", "Мир" ->
            when {
                (sumTransfer + sumMonth) < limitTransferMonth && sumTransfer < limitTransferOnce ->
                    if (sumTransfer * 0.75 / 100 < minFee) "Комиссия составляет (руб.): $minFee" else "Комиссия составляет (руб.): " + sumTransfer * 0.75 / 100

                else -> "Превышен лимит перевода"
            }

        else ->
            when {
                (sumTransfer + sumMonth) < limitTransferMonthVK && sumTransfer < limitTransferOnceVK -> "Комиссия составляет (руб.): " + 0.0
                else -> "Превышен лимит перевода"
            }
    }
}