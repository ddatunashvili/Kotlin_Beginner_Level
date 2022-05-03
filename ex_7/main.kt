

// Expressions, Statements, Blocks
fun main(){
    val total:Int = (1..500).random() + 100 // this line is expression
    val numbCheck = if (total > 500) "More than 500" else "Less than 500" // expression

    println("total = $total")
    println("total = $numbCheck")

    // statement is line of execution
    println("Hello Nigga")  // statement
    val quickMaths = 2+1-1 // expression
    println(quickMaths)  // statement


    // block { }
    var number = 0 // statement
    for (i in 1..5){ // this is block start
        // block statements are codes inside block
        number += i // statement
        print("$number") // statement

    }// this is block end

}

