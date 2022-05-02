
/* შედარებისა და ლოგიკური ოპერატორები*/


fun main(){
    var working = false
    // თუ არ მუშაობს 
    if (!working){
        println("not working")

    }// სხვა შემთხვევაში 
    else{
        println("working")
    }
    // რენდომ რიცხვი 1 დან 10 მდე
    var randomInt = (1..10).random()
    // ლამაზად გამოტანა
    println("number is: $randomInt ")
    // თუ > 0 და ასევე < 5 ზე
    if ( randomInt > 0 && randomInt < 5  ){
        println("randomInt is from 0 to 10 ")
    }// თუ ტოლია 5 ან 6 ის ტოლია
    else if(randomInt == 5 || randomInt == 6){
			println("its 5 or 6")
    }
    // ნაკლებია ან ტოლია ასევე შეიძლება >= მეტია ან ტოლიაც
    if(randomInt <= 3){
        println("its 3 or smaller than 3")
    }   
    // არ უდრის 8ს და არ უდრის 9ს
    else if(randomInt != 8 && randomInt != 9){
        println("its not 8 or 9")
    } // ან 8ს უდრის ან 9ს
    else if(randomInt == 8 || randomInt == 9){
        println("its 8 or 9")
    }else{
        println(randomInt)
    }

}
 