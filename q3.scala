//function to calculate sphere volume
def SphereVolume(radius: Double): Double = {

    (4.0/3.0) * math.Pi * radius * radius * radius
}

def main(args: Array[String]): Unit = {

    val radius = 5.0
    val volume = SphereVolume(radius)

    println(s"Voluume of the spehere with radius $radius = $volume")
}