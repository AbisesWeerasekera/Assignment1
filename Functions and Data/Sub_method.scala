

object Sub_method extends App{

val x=new Rational(3,4)
val y=new Rational(5,8)
val z=new Rational(2,7)
val f=x.sub(y)
val s=f.sub(z)

println(x)
println(y)
println(z)
println(s)

}

class Rational(n:Int,d:Int){
require(d>0,"Denominator must be positive")

def numer=n/gcd(Math.abs(n),d)
def denom=d/gcd(Math.abs(n),d)

private def gcd(a:Int,b:Int):Int= {if(b==0) a else gcd(b,a%b)}
//method
def sub(r:Rational)=new Rational(this.numer*r.denom - this.denom*r.numer,this.denom*r.denom)
//def neg=new Rational(-this.numer,this.denom)



override def toString= numer + "/" +denom
}
