class Main {
    // 1 განსხვავებული ელემენტები
    fun differIn(a:Array<Int>){
        print(a.distinct())
    }
    //  2 თანაკვეთა
    fun  arrayCommon(a:Array<Int>,b:Array<Int>) {
        for (i in a.indices) {
            for (j in b.indices) {
                if (a[i] == b[j]) {
                    println(a[i])
                }
            }
        }
    }

    //  3 გაერთიანება
    fun unityze(a:Array<Int>,b:Array<Int>): Set<Int> {
        var c =a.union(b.asList())
        return c
    }
    //  4
}