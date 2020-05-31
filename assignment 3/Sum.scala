import scala.io.StdIn.readInt

object Sum extends App{

printf("Enter a number to add even numbers up to :");
var n:Int=readInt();
printf("Total %d ",sum(n));


def sum(n:Int):Int=n match{
case n if(n==1) => 1
case _ => sum(n-1)+n
}
} 
