case class Casting(x:Bank,y:Bank)


object Bank extends App{
var r1=new Bank("970886782V",12345,100000.00)
var r2=new Bank("970352637V",23413,200000.00)
var r3=new Bank("978756732V",34567,300000.00)
var r4=new Bank("978987868V",36473,-1000.00)
var r5=new Bank("970365313V",68373,-200.00)

var bank:List[Bank]= List(r1,r2,r3,r4,r5)
val negbal=(b:List[Bank])=> b.filter(x => x.balance<0)
//val x= r1+r2+r3+r4+r5
//var totbalance=(b:List[Bank])=> b.reduce( (x:Bank,y:Bank) => (x.balance).asInstanceOf[Any] + (y.balance).asInstanceOf[Any] )
var totbalance=(b:List[Bank])=> b.reduce( (x,y) => (x._3.asInstanceOf[Double] + y._3.asInstanceOf[Double]))
//println(negbal(bank))
println(totbalance(bank))
//println(x)


}

class Bank(id:String,n:Int,b:Double){
  val nic:String=id
  val acnumber:Int= n
  val balance:Double=b

//def +(r:Bank)=new Bank(this.nic,this.acnumber,this.balance+r.balance)


//override def toString = "Account number= " +acnumber+ "Negativebalance= "+ balance
override def toString = "Total balance= "

}
