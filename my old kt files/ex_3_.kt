/*
https://www.youtube.com/watch?v=F9UC9DY-vIU&ab_channel=freeCodeCamp.org
* ჯავასგან განსხვავებით კოტლინში ტიპები არის none null
* განსხვავდება string და non nullable strirng
* print - println
*/
var age: Int = 22
fun main(){
//    mutable var
    var na = "Tane"
//    local readonly val
    val name: String = "Nate?"
//    nullable string
    var nam: String? = null
// auto detect
    var age = 1

//    if else
    if (nam != null){
        println(nam)
    }else{
        println("hello")
    }
//    when
    when (na){
        null -> println("hi")
//        else in when
        else -> println("hek")
    }
//        asign if ....
    val greeringToPringt = if (nam != null) nam else "hias"
    println(greeringToPringt)
//    asign when....
    val green = when(nam){
        null -> "has"
        else -> nam
    }
    println(green)

}