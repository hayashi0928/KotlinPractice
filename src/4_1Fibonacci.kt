import java.lang.NumberFormatException


fun main(): Unit {
    var fib=ArrayList<Int>()
    val max: Int? = try { readLine()?.toInt()}catch(ex:NumberFormatException){ return }

    if(max==null){
        return
    }

    for(n:Int in 0..max){
        when(n){
            0,1 ->fib.add(n)
            else ->fib.add(fib.get(n-1)+fib.get(n-2))
        }
    }
    for(n:Int in 0..(max-1)) {
        print("${fib.get(n)} + ")
    }
    print(fib.get(max))
}
