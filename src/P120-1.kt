import java.io.InputStreamReader
import java.lang.StringBuilder
import java.net.Socket
import java.nio.charset.Charset

fun main() {
    val ptt= Socket("ptt.cc",23)
    val input=ptt.getInputStream().bufferedReader(Charset.forName("Big5"))
    var segment:String=input.readLine()
    while(segment!=null){
        println(segment)
        segment= input.readLine()
    }
    input.close()
    ptt.close()

}