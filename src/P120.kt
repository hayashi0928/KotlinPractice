import java.net.Socket
import java.nio.charset.Charset

fun main() {
    val ptt= Socket("ptt.cc",23)
    val input=ptt.getInputStream().reader(Charset.forName("Big5"))
    var data=input.read()
    while(data>-1){
        print(data.toChar())
        data=input.read()
    }
    input.close()
    ptt.close()

}