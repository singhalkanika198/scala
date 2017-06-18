import Array._

object arr extends App
{
	var z:Array[Int]=new Array[Int](3)
	z(0)=1
	z(1)=2
	z(2)=3;
	for(i<-z)
	println(i)  // 1 2 3


	var y:Array[Int]=Array(1,2,3)
	for(i <-y)
	println(i)  // 1 2 3

	var m:Array[Int]=Array(1,2,3,4)
	for(i <- 0 to (m.length-1))
	println(m(i))   //1 2 3 4

	var p=ofDim[Int](3,3)
	for(i<- 0 to 2)
	{
		for(j <- 0 to 2)
		p(i)(j)=j
	}

	for(i <- 0 to 2)
	{
		for( j <- 0 to 2)
		print(p(i)(j))
		println("\n")
	}             // 012
	              //012
	              //012

	var l1=Array(1,2,3,4)
	var l2=Array(3,4,5)
	var l3=concat(l1,l2)
	for(i <- l3)
	print(i)   // 1234345

	var l4= range(10,20,2)
	var l5=range(10,20)
	for(i<-l4)
	println(l4)   // 10 12 14 16 18 20 
	for(i<-l5)
	println(l5)   // 10 11 12 13 14 15 16 17 18 19 20
} 