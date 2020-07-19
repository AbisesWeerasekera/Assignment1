import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
import scala.io.StdIn.readChar

object Caesar extends App{

var alphabet:String="ABCDEFGHIJKLMNOPQRSTUVWXYZ"

println("Enter your String");
var s:String=readLine();

println("\nEnter a shift key value");
var key:Int=readInt();


var E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)

var cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))


var ct=cipher(E,s,key,alphabet);
println("\nEncrypted String: "+ct)

val pt=cipher(D,ct,key,alphabet)
println("Decyrpted String: "+pt);



}