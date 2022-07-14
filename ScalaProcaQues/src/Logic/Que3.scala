package Logic

object Que3 {
  def main(args:Array[String]): Unit ={
    val s1=scala.io.StdIn.readLine("Please enter any string")
    for(i<-0 to s1.length-1){
      var count=0
      for(j<-i to s1.length-1){
        if(s1(j)==s1(i)){
          count=count+1
        }
      }
      if(count>1){
      println(s1(i) +" appeared "+count+" times")}
    }
  }

}
