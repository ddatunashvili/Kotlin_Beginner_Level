

/*
ზოგი ცვლადი იცვლება var immutable (var can be reassigned to point at new data)
ზოგი არ იცვლება val mutable (val can never be reassigned)
*/


// variables (auto type)
var item = "hammer"
//same as  var item:String = "hammer"
val fruit = "apple"

val number = 3.1

fun main() {
    
	// number = 4 readonly
	item = "carrot"
	println(item)
	
	// fruit = "hello" readonly
	
	
	val name = "david"
    //    val name = readLine()
    println("Hello $name!")
}
