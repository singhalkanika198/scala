import scala.io._

object invertedindex extends App{


	def apply(path:String): Map[String, Vector[String]]=
	{
		val file=Source.fromFile(path)
		val lines=file.getLines().toList
		println(lines.length)
		//for(i<-lines)
		//println(i)
		file.close

		lines.map(_.split(" "))
      .flatMap(x => x.drop(1).map(y => (y, x(0))))
      .groupBy(_._1)
      .map(p => (p._1, p._2.map(_._2).toVector))
    }

	var m=apply("/home/practo/search_scala/indexingdoc")
	println("Search your doctor here: ")
	var s=readLine()
	show(m.get("s"))
	def show(x: Option[Vector[String]]) = 
      x match {
      case Some(s) => {
      	println(s)}
      case None => "?"}
   }