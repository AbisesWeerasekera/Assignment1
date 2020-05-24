object sphere {
   def main(args: Array[String]) {
      var radius: Double=5.00;
      var h : Double = 4/3;
      var pi: Double = 22/7;
      
      var vol : Double =h * pi * radius * radius * radius;
      println("volume of a sphere with radius 5 is "+vol);
   }
}