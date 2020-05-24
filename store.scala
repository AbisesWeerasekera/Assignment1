object store {
   def main(args: Array[String]) {
      var book: Double=24.95;
      var wholebook: Double=(book)* 60.00;
      var cost: Double=(wholebook - (wholebook*0.40)+(50*3)+(10*(0.75)));
      
      
      println("total wholesale cost for 60 copies Rs"+cost);
   }
}