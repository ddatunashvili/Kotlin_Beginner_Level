
// ციფრების დასახელების ფუნქცია
fun nameIt(int:Int) {
    val n = mapOf(
            1 to "ერთი",
            2 to "ორი",
            3 to "სამი",
            4 to "ოთხი",
            5 to "ხუთი",
            6 to "ექვსი",
            7 to "შვიდი",
            8 to "რვა",
            9 to "ცხრა",
            10 to "ათი",
            11 to "თერთმეტი",
            12 to "თორმეტი",
            13 to "ცამეტი",
            14 to "თოთხმეტი",
            15 to "თხუთმეტი",
            16 to "თექვსმეტი",
            17 to "ჩვიდმეტი",
            18 to "თვრამეტი",
            19 to "ცხრამეტი",
            20 to "ოცი"
    )
    val teen = mapOf(
            20 to "ოც",
            30 to "ოც",
            40 to "ორმოც",
            50 to "ორმოც",
            60 to "სამოც",
            70 to "სამოც",
            80 to "ოთხმოც",
            90 to "ოთხმოც"
    )
    val nhundred = mapOf(
            100 to "ას",
            200 to "ორას",
            300 to "სამას",
            400 to "ოთხას",
            500 to "ხუთას",
            600 to "ექვსას",
            700 to "შვიდას",
            800 to "რვაას",
            900 to "ცხრაას"
    )
    val nthousand = mapOf(
            1000 to "ათას",
            2000 to "ორიათას",
            3000 to "სამიათას",
            4000 to "ოთხიათას",
            5000 to "ხუთიათას",
            6000 to "ექვსიათას",
            7000 to "შვიდიათას",
            8000 to "რვაათას",
            9000 to "ცხრაათას"
    )
    /* მოცემულია შედეგის (output_ის) მაგალითები*/
    if (int in 1..20) {
        //      20
        print(n[int])
    } else if (int in 21..99) {
        //                ოც    და    ერთი
        print(teen[int - int % 10] +"და"+ n[int % 20])
    } else if (int in 100..1000) {
        if (teen[int - (int - int % 100) - int % 10] == null && n[int % 20] == null) {
            //                        ას     ი
            print(nhundred[int - int % 100] + "ი")
        } else if (n[int % 20] == null) {
            //                         ას    ოც    ი
            print(nhundred[int - int % 100] + teen[int - (int - int % 100) - int % 10] + "ი")
        } else {
            //                         ას      ოც    და    ერთი
            print(nhundred[int - int % 100] + teen[int - (int - int % 100) - int % 10]+"და" + n[int % 20])
        }
    } else if (int in 1000..10000) {
        if (teen[(int-(int - int % 1000+int - int % 100-(int - int % 1000)))-(int-(int - int % 1000+int - int % 100-(int - int % 1000)))%10] ==null && n[(int-(int - int % 1000+int - int % 100-(int - int % 1000)))%20] == null){
            //                        ათას    ი
            print(nthousand[int - int % 1000]+ nhundred[int - int % 100-(int - int % 1000)]+"ი")
        } else if (n[(int-(int - int % 1000+int - int % 100-(int - int % 1000)))%20] == null){
            //                        ათას     ას  ი
            print(nthousand[int - int % 1000]+ nhundred[int - int % 100-(int - int % 1000)]+teen[(int-(int - int % 1000+int - int % 100-(int - int % 1000)))-(int-(int - int % 1000+int - int % 100-(int - int % 1000)))%10]+"ი")
        } else{
            //                        ათას    ას    ოც   და   ერთი
            print(nthousand[int - int % 1000]+ nhundred[int - int % 100-(int - int % 1000)]+teen[(int-(int - int % 1000+int - int % 100-(int - int % 1000)))-(int-(int - int % 1000+int - int % 100-(int - int % 1000)))%10]+"და"+n[(int-(int - int % 1000+int - int % 100-(int - int % 1000)))%20] )
        }
    }
    else{
        print("არვიცი")
    }}
    
    
    fun main(){
        nameIt(19999)
    }
    