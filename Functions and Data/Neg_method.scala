import scala.io.StdIn.readInt

object Neg_method extends App{


println("Enter the Numerator of your Rational number")
val a:Int=readInt()
println("Enter the Denominator of your Rational number")
val b:Int=readInt()

val x=new Rational(a,b)

//println("Negative number of your Rational number is :")
println(x.neg)

}

class Rational(n:Int,d:Int){
  require(d>0,"Denominator must be positive")

def numer=n/gcd(Math.abs(n),d)
def denom=d/gcd(Math.abs(n),d)

private def gcd(a:Int,b:Int):Int= {if(b==0) a else gcd(b,a%b)}
//method
def neg=new Rational(-this.numer,this.denom)


override def toString= numer + "/" +denom
}
