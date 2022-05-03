// please run in android studio
import java.util.*

//  User Input and try except
fun main(){
    try{ // try this code
        val reader = Scanner(System.`in`)
        print("Enter a number: ")
        val number = reader.nextInt()
        println("Your number: $number")
    }
    catch(e:Exception){
        // if try not working try this
        println("Not inputed valid number" )
        println("error: $e") 
    }
}