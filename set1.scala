object set1 extends App
{
	var z: Set[Int]=Set(1,2,3,4)
	println(z.head) // 1
	println(z.tail) // 4


	var x=Set("kanika" , "riya")
	println(x.isEmpty) // 0
	println(x.head)//kanika
	println(x.tail)// riya


	  val fruit1 = Set("apples", "oranges", "pears")
      val fruit2 = Set("mangoes", "banana")

      // use two or more sets with ++ as operator
      var fruit = fruit1 ++ fruit2
      println( "fruit1 ++ fruit2 : " + fruit )

      // use two sets with ++ as method
      fruit = fruit1.++(fruit2)
      println( "fruit1.++(fruit2) : " + fruit )

       val num = Set(5,6,9,20,30,45)

      // find min and max of the elements
      println( "Min element in Set(5,6,9,20,30,45) : " + num.min )
      println( "Max element in Set(5,6,9,20,30,45) : " + num.max )
}