fun main() { // Solve the equivalent percentage of
    var value: Double?
    var percentage: Double?

    do {
        println("\nEnter a percentage: ")
        percentage = readLine()?.toDoubleOrNull() ?: 0.0

        println("Enter a value to get a percentage: ")
        value = readLine()?.toDoubleOrNull() ?: 0.0

        if (percentage == 0.0 || value == 0.0) {
            println("Invalid input. Please enter non-zero values.")
            continue
        }

        val decimalPercentage = percentage / 100
        val total = decimalPercentage * value
        println("Answer: $total")

    } while (percentage == 0.0 || value == 0.0)
}
