
/* არითმეტიკული ოპერატორები და მინიჭებები */
fun main() {
    val a = 20.1f
    val b = 10.1f

    val t1 = "beginning"
    val t2 = " middle "
    val t3 = "end"

    // ფორმატირება ლამაზად
    println("$a + $b = ${a+b}")
    println("$a - $b = ${a-b}")
    println("$a % $b = ${a%b}")
    println("$a / $b = ${a/b}")
    println("$a *  $b = ${a*b}")
    println(t1+t2+t3)

    var total = 0
    total += 5 // *= /= -= %= გაზრდა გამრავლება გახარება
    // 5 ით გაზრდა
    println(total )
    // მინუსიანები
    total = 4 + (-3)
    println(total)
    // ინკრემენტაცია
    ++total 
    println(total)
    // დეკრემენტაცია
    --total 
    println(total)

}