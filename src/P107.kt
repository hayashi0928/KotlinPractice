import java.net.Socket

fun main() {
    val ptt= Socket("ptt.cc",23)
    val input=ptt.getInputStream()
    val output=ptt.getOutputStream()
    var data:Int
    for(x in 1..10){
        data=input.read()
        print("$data  ")
    }


}