// Prime Numbers
fun main() {
    println("[ ENTER TWO INTEGERS ]")
    print("First Integer: ")
    val n1 = readLine()?.toIntOrNull() ?: 0
    print("Second Integer: ")
    val n2 = readLine()?.toIntOrNull() ?: 0

    val (lower, higher) = if (n1 < n2) n1 to n2
    else n2 to n1

    println("\nPrime numbers between $lower and $higher:")
    var firstPrimePrinted = false
    for (i in lower..higher) {
        if (IsPrime(i)) {
            if (firstPrimePrinted) print(", ") else firstPrimePrinted = true
            print(i)
        }
    }
}
fun IsPrime(Num: Int): Boolean {
    if (Num <= 1) return false
    if (Num <= 3) return true

    var i = 2
    while (i * i <= Num) {
        if (Num % i == 0) return false
        i++
    }
    return true
}