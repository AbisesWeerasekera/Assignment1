import scala.io.StdIn.readInt;

object Ticket extends App{

printf("Enter the ticket price:\n");
var q:Int=readInt();

def attendence(p:Int):Int=120+(15-p)*4;
def revenue(p:Int):Int=p*attendence(p);
def cost(p:Int):Int=500+3*attendence(p);
def profit(p:Int):Int=revenue(p)-cost(p);

var pr:Float=profit(q);
printf("If Ticket price is Rs. %d then profit will be Rs. %.2f",q,pr);


}