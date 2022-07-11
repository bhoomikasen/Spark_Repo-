package Logic

object que1 extends App {

  val s1="hello hi hey"
  var s3=""
for(i<-0 to s1.length-1){
  if(s1(i)=='h'){
    s3=s1.replace('h','w')
    println(s3)
  }

}
  println(s3)


}
