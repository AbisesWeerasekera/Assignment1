import scala.io.StdIn.readDouble

object Point extends App{

val p1=Point(6,8)
val p2=Point(3,6.7)
val p3= p1.x + p2.x
println("----Summation of "+Point(6,8)+ " and "+Point(3,6.7)+ "----")
println("Sum of x points= :"+p3)
val p4= p1.y + p2.y
println("Sum of y points= :"+p4)
println("Summation point of two given point :"+Point(p3,p4))


println("\n----Move :"+Point(10,28) + " By dx= "+ 4 + " and dy= " + 3 + " ----" )
val p5=Point(10,28)
val p6=p5.move(4,3)

val p7=Point(3,4)
val p8=Point(4,1)
val p9 = p7.distance(p8)
println("\n----Distance between---- \n "+p7+ " and " + p8 + " = " + (p9.toFloat))


val p10=Point(6,8)
println("\n----Invert x and y coordinates---- of " + p10)
val p11= p10.invert(p10)
println(p11)



}

case class Point(a:Double,b:Double){
var x:Double=a
var y:Double=b

def move(dx:Double,dy:Double):Unit={
  x= x + dx;
  y= y + dy;
  println("Point x location "+x)
  println("Point y location "+y)
}

def distance(d1:Point):Double ={ return(scala.math.sqrt((scala.math.pow((this.x - d1.x),2)) + scala.math.pow((this.y -d1.y),2)))}

def invert(in:Point):Unit={
  x = this.x
  y = this.y
  println("New x value is = "+y)
  println("New y value is = "+x)
}
}
