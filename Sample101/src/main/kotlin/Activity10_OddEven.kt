fun main() { // OddEven
    do {
        print("\nEnter a number: ")
        val num: Int? = readLine()?.toIntOrNull()

        when {
            num == null || num == 0 -> {
                println("Invalid input")
            }
            num % 2 == 0 -> {
                print("$num is Even -> ")
                PrintEvenNumbers(num)
            }
            else -> {
                print("$num is Odd -> ")
                PrintOddNumbers(num)
            }
        }
    } while (num == null || num == 0)
}

fun PrintEvenNumbers(num: Int) {
    for (i in 2..num step 2) {
        print(i)
        if (i != num) {
            print(", ")
        }
    }
}

fun PrintOddNumbers(num: Int) {
    for (i in 1..num step 2) {
        print(i)
        if (i != num - 1) {
            print(", ")
        }
    }
}
