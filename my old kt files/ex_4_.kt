package codes
/*
 primary :
  mutable_ var surname: "datunashvili"
*  read-only _ val name= "davit"
* */



// პრაიმერი კონსტრუქტორი
/*
* public
* internal public within module
* private - show only in file
* protected - show in class or in subclass
* */
class Person(val name:String, val surname: String) {
//    ჯერ ეშვება init _ ები
    init {
        println("init 1")
    }
//სექონდარი კონსტრუქტორი
// აწარმოებს ალტერნატიულ მნიშვნწლობას ინიციალიზაციისთვის
// არაა საჭირო სექონდარი რადგან შეგვიძლია დეფოლტ პარამეტრები გამოვიყენოთ
    constructor(): this("davit","datunashvili"){
        println("secondary")
    }

    init {
        println("init 2")
    }

//    add property
    var nickName:String? = null
        set(value) {
//            დასეტდა
            field = value
            println("the setter new nickname is> $value")
        }
        get() {
            println("the getter returned value is >$field")
//            დაბრუნდა
            return field

        }
//method
    fun printinfo(){
//    elvis operator
//    if left is not null  return left
//    otherwise return right
        val nickNamep =  nickName ?: "no nickname" //
        println("name >$name  nickName > $nickName nicknamep > $nickNamep surname > $surname")
    }
}















//primary
//fun main(args: Array<String>) {
//
//    val person1 = codes.Person("Joe", 25)
//
//    println("First Name = ${person1.firstName}")
//    println("Age = ${person1.age}")
//}
//
//class codes.Person(val firstName: String, var age: Int) {
//
//}

//Example: Kotlin Secondary Constructor
//fun main(args: Array<String>) {
//
//    val p1 = AuthLog("Bad Password")
//}
//
//open class Log {
//    var data: String = ""
//    var numberOfData = 0
//    constructor(_data: String) {
//
//    }
//    constructor(_data: String, _numberOfData: Int) {
//        data = _data
//        numberOfData = _numberOfData
//        println("$data: $numberOfData times")
//    }
//}
//
//class AuthLog: Log {
//    constructor(_data: String): this("From AuthLog -> " + _data, 10) {
//    }
//
//    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData) {
//    }
//}