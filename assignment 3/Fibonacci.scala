import scala.io.StdIn.readInt;

object Fibonacci extends App{

println("Enter a number to find fibonacci series up to:\n");

var n:Int=readInt();
println("fibonacci series \n");
fibonacciseq(n);



def fibonacci(n:Int):Int=n match{
case n if(n==0) =>0
case n if(n==1) =>1
case _ => fibonacci(n-1)+fibonacci(n-2)
}



def fibonacciseq(n:Int):Unit={
if(n>0) fibonacciseq(n-1) 
println(fibonacci(n))
}
}



