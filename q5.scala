def easypace(dis: Int): Int = {
    dis * 8
}

def tempo(dis: Int): Int ={
    dis * 7
}

def main(args: Array[String]): Unit = {
     
     val totalTime = easypace(2) + tempo(3) + easypace(2)

     println(s"Total time taken = $totalTime minutes") 
}