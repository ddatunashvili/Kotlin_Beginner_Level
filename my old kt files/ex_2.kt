
/*
სიები
მასივი
მაპები
*/

// სია
val namess = listOf("ana","lika")

//single expression function
fun sayName (hello: String, names:List<String>){
    names.forEach{name ->
        println("$hello $name")
    }
}

fun main() {
//    immutables
//    მასივის შექმნა
    val arr = arrayOf("kote","astra")
    println(arr.size)
    println(arr[0])
    println(arr.get(0))
//    for ციკლით იტერირება
    for (item in arr) {
        println("${arr.indexOf(item)} $item ")
    }
//    ფორიჩი
    arr.forEach {item ->
        println(item)
    }
//    ფორიჩ ინდექსი
    arr.forEachIndexed { index, arr ->
        println("$arr is at index $index")
    }
//    სიის შექმნა
    val lit = listOf("dato","natia")
    println(lit[0])

//    foreach
    lit.forEach{item ->
        println(item)
    }
//    map type key and  value
    val map = mapOf(1 to "a",2 to "b")
    map.forEach{key,value -> println("$key -> $value")}

// mutable list
    val list = mutableListOf("a","b","c")
    list.add("d")
    val mapi = mutableMapOf(1 to "a",2 to "b")
    mapi.put(3,"c")

// function call
    sayName("hi", names = namess)
}