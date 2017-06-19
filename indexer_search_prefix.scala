import scala.io._
import scala.util.matching.Regex
    

object indexer_search_prefix extends App{


	def apply(path:String): Map[String, Vector[String]]=
	{
		val file=Source.fromFile(path)
		val lines=file.getLines().toList
		//println(lines.length)
		//for(i<-lines)
		//println(i)
		file.close

		lines.map(_.split(" "))
      .flatMap(x => x.drop(1).map(y => (y, x(0))))
      .groupBy(_._1)
      .map(p => (p._1, p._2.map(_._2).toVector))
    }


    println("Search your prefix here: ")
	var s=readLine()
	var m=apply("/home/practo/search_scala/indexingdoc").filter(x=> prefix(x._1 , s))
  //m.foreach{i => println(i)}
	//println(m.size)
    m.keys.foreach{ i =>  println(i) }
    if(m.size==0)println("No record found")

   def prefix(str:String , pattern:String):Boolean=
   {
   	var flag:Boolean=true
    //val numberPattern: Regex = pattern.r
    str.startsWith(pattern) match {
      case true => 
      flag=true
      case false => 
      flag=false
    }
    if(flag) return true
    else return false
   }
}



