// calculate the area of a disk 
def areaOfDisk(radius: Double): Double = {
  
  math.Pi * radius * radius
}

// Main function 
def main(args: Array[String]): Unit = {
  
  val radius = 5.0
  val area = areaOfDisk(radius)
  
  println(s"The area of a disk with radius $radius = $area")
}
