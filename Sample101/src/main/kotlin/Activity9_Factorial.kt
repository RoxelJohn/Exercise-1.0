// Factorial
fun main() {
    do {
        var Num: Int?
        print("\nEnter a number: ")
        Num = readLine()!!.toIntOrNull() ?: 0

        if (Num == 1) {
            print("$Num")
        } else {
            var result: Int = Num
            print("$Num -> ")

            for (i in Num downTo 1) {
                print(i)
                if (i != 1) {
                    print(" × ")
                    result *= (i - 1)
                }
            }
            println(" = $result")
        }
    } while (Num == 1)
}
