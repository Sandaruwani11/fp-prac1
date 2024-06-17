def bookPrice(num: Int): Double = {
    num * 24.95
}

def discount(amount: Double): Double = {
    amount * 0.4
}

def shipCost(num: Int): Double = {
    3 * num + ((num - 50) * 0.75) 
}

def totalCost(num: Int): Double = {
    bookPrice(num) - discount(bookPrice(num)) + shipCost(num)
}

def main(args: Array[String]): Unit = {

    val num = 60
    val totalcost = totalCost(num)

    println(s"Total Cost of $num books = $totalcost")
}