object func2 extends App
{
	printstrings("kanika" , "riya" , "tanuja" , "sharad")

	def printstrings(args: String*)
	{
		for(arg <- args)
		print(arg)
	}
}