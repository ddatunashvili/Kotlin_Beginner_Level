

fun sayHello(greeting:String, vararg items:String ){
    items.forEach { item ->
        println("$greeting $item")
    }
}

//default value
fun greet(greet:String = "Hello", name: String) = println("$greet $name")

fun main(){
    val things = arrayOf("dino","jema")
//    spread operator
    sayHello(greeting = "hi",items =  *things)
//    named arguments
    greet(name = "david")
}