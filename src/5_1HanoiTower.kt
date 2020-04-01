fun main(){

    println("請輸入有幾層河內塔：")
    val n=try { readLine()?.toInt()}catch(ex:NumberFormatException){ return }
    if(n==null || n<1){
        return
    }
    hanoidish(n,1,3)
}

fun hanoidish(dish:Int,from:Int,to:Int){
    if(dish==1){
        println("第1個盤子，從塔${from}移到塔${to}")
        return
    }
    hanoidish(dish-1,from,6-from-to)
    println("第${dish}個盤子，從塔${from}移到塔${to}")
    hanoidish(dish-1,6-from-to,to)

}