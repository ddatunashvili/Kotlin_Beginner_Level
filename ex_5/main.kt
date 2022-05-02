
/* კუთვნილების შემოწმების ოპერატორი  */

fun main(){
    // სიის შექმნა (მასივი)
    var nums = listOf(1,2,3,4,5,6)
    var randomN = (1..10).random()

    // in ოპერატორი

    if (randomN in nums){
        println("its in nums")
    }
    // თუ არ არის 
    else if (randomN !in nums){
        println("its nor in nums")
    }

}