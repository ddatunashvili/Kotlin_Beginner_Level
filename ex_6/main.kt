// Type Conversion

/*
"a" to int - N 
"2" to int - Y 2
2.1 to int - Y 2
2 to str - Y "2"
2 to float - Y 2.0
1 to bool - Y true
0 to bool - Y false
*/
fun main(){
    // print("Ennter a number: ") // input
    // val number - readLine()!!.toInt() // not null and its converted to int
    var number = "5".toInt() // readline is string and it casted to int
    println(number+1) // 6 
    println(number.toString()+1) // "51"

    val total: Float = number + number.toFloat() // 5 + 5.0 = 10.0
    println(total)
}