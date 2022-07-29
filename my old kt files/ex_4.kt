import codes.Person

fun main(){
//    create instance of class
    val person = Person()
//  property access syntax :
//  reference property directly by name
    person.name
    person.surname
    println("get/set")
    person.nickName = "Shon"
    person.nickName = "nino"
    println(person.nickName )
    println("method call")
    person.printinfo()
    println("method end")

}