import scala.io.StdIn.readInt;

object EvenSum extends App{

printf("Enter a number:\n");
var n:Int=readInt();

printf("sum of even number up to %d is %d ",n,evensum(n));

def iseven(n:Int):Boolean= n match{
case n if(n==0) => true
case _ => isodd(n-1)

}

def isodd(n:Int):Boolean = !(iseven(n));



def evensum(n:Int):Int= n match{
case n if(n==0) => 0;
case n if(!iseven(n)) => evensum(n-1);
case n if(iseven(n)) => n+evensum(n-1);
}

}
