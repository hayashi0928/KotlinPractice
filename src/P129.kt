import sun.applet.Main
import java.io.IOException
import java.net.ServerSocket
import javax.sound.sampled.Port

fun PortScanner(){
    for(i in 1..65535){
        try {
            val ss= ServerSocket(i)
        }catch (e:IOException){
            println("port${i}被佔用中")
        }
    }
}
fun main(){
    PortScanner()
}