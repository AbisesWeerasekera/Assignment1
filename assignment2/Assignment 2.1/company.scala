import scala.io.StdIn.readInt;

object company extends App{

printf("Enter Number of Working hours:\n");
var wh:Int=readInt();

printf("Enter Number of OT hours:\n");
var ot:Int=readInt();

def income(h1:Int,h2:Int):Int=h1*150+h2*75;
def tax(x:Int)=x*0.1;

def takehome(h3:Int,h4:Int)=income(h3,h4)-tax(income(h3,h4));

printf("Take home salary is Rs %.2f",takehome(wh,ot));
}

