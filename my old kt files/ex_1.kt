class Main {
    //  უდიდესი საერთო გამყოფის გამოთვლა
    fun usg(a: Int, b: Int): Int {
        var a = a
        var b = b
        while (a != b) {
            if (a > b) {
                a -= b
            } else {
                b -= a
            }
        }
        return a
    }

    // უმცირესი საერთო ჯერადის გამოთვლა
    fun usj(a: Int, b: Int): Int{
        var q = if(a>b) a/b else b/a // რამდენჯერ მოთავსდება

        var usg = if (a>b) a-(q*b) else b-(q*a) // ნაშთი გაყოფისას

        val usj = if( usg != 0) (a*b) / usg else  (a*b)

        return usj
    }

    // სტრიქონის შემოწმება თუ შეიცავს "$"
    fun check_string(str: String): Boolean {
        return "$" in str
    }

    // ლუწი რიცხვების დათვლის ფუნქცია
    fun sum_even(a: Int): Int{
        var sum:Int = 1
        for (i in 0..a) if (i % 2 == 0) sum += i
        return sum
    }

    // ციფრების შეტრიალება
    fun reverse(a: Int): Int {

        var text = a.toString()
        var reversed = text.reversed()

        return reversed.toInt()
    }

    // არის თუ არა პალინდრომი
    fun check_Palindrome(s: String): Boolean {
    //  ასოების დაპატარავება, ცარიელი ადგილების ამოღება
        val pal = s.toLowerCase().replace("[^a-zA-Z0-9]".toRegex(), "")
    //  სტრიქონის მის შემოტრიალებულთან შედარება
        return pal == pal.reversed()
    }    
}