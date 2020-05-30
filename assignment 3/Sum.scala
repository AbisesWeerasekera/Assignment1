import scala.io.StdIn.readInt

object Sum 
{ 
    // Function defined 
    def sum(num: Int): Int=
    { 
        if (num == 1) 
            1
        else
            sum(num - 1) + num 
    } 
      
    // Main method 
    def main(args:Array[String]) 
    { 
printf("Enter a number :")
var n:Int=readInt()
        println(sum(n)) 
    } 
} 
