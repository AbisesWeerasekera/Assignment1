import scala.io.StdIn.readInt

object EvenOdd extends App{

printf("Enter a number to check even or odd:\n");
var n:Int=readInt();

def iseven(n:Int):Boolean=n match{
case n if(n==0) => true
case _ => isodd(n-1)

}

def isodd(n:Int):Boolean = !(iseven(n));

printf("Is even ? %b",iseven(n));
}