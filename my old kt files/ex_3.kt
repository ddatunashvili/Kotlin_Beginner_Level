
/*
* ფუნქცია წინასწარ განსაზღვული ველიუს ტიპით
top level functions
* */

//single expresion function
fun sayHello(itemToGreet:String,itemTo:String) = println("$itemTo $itemToGreet")
//:String
fun getName():String = "helll"
// Unit - doesnt return anythin usefull
//Unit is used when the function basically return nothing of interest
fun func():Unit = println("ერთი value")


fun main(){
    println("help")
    println(getName())
    sayHello("ss","penis")
    func()
}


