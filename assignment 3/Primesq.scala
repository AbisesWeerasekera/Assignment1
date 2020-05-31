import scala.io.StdIn.readInt

object Primesq extends App{

printf("Enter a number:\n");
var c:Int=readInt();

println("Prime number in sequence up to "+c)
primesq(c);

def gcd(a:Int,b:Int):Int=b match{
case b if(b==0) =>a;
case b if(b>a) =>gcd(b,a);
case _ => gcd(b,a%b);
}


def prime(p:Int,n:Int=2):Boolean= n match {  
case n if(n==p) => true  
case n if gcd(p,n)>1 => false   
case n => prime(p,n+1) 
} 

def primesq(c:Int):Unit={
if(c>1){
if(prime(c)==true){
printf("%d\t",c);
primesq(c-1);

}else{
primesq(c-1);


}
 
}

}
}

