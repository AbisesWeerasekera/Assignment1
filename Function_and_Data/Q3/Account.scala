
object Account extends App {
var bank:List[Account]=List()

var r1= new Account("978956382V",11233,120000.00)
var r2= new Account("970983453V",13354,110000.00)
var x=r1.transfer(r2)

println(r1)
println(r2)
println(x)

}

class Account(id:String,n:Int,b:Double){
    val nic:String=id
    val accnumber:Int=n
    var balance:Double=b

 def transfer(r:Account)= new Account(this.nic,this.accnumber,this.balance+r.balance)

override def toString="id= "+nic+" Account number="+accnumber+" balance="+balance

}
