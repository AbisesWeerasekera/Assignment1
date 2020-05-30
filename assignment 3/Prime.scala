object Prime extends App{

// gcd function
def gcd(a:Int,b:Int):Int=b match{
case b if(b==0) =>a;
case b if(b>a) =>gcd(b,a);
case _ => gcd(b,a%b);
}

// prime function
def prime(p:Int,n:Int=2):Boolean= n match {  
case n if(n==p) => true  
case n if gcd(p,n)>1 => false   
case n => prime(p,n+1) 
} 


printf("%b\n",prime(5));
printf("%b\n",prime(8));

}


