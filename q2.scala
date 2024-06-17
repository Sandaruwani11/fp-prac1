// Function to convert Celsius to Fahrenheit
def celsiusToFahrenheit(celsius: Double): Double = {
  celsius * 1.8 + 32
}
//main function
def main(args: Array[String]): Unit = {
  val celsius = 35
  val fahrenheit = celsiusToFahrenheit(celsius)
  println(s"$celsius°C = $fahrenheit°F")
}
