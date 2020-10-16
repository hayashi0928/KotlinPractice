import java.net.InetSocketAddress
import java.net.Socket

fun main() {
    var socket=Socket()
    var local=InetSocketAddress("localhost",2222)
    var ad= InetSocketAddress("ptt.cc",23)
    socket.bind(local)
    println("本地埠號:${socket.localAddress}")
    socket.connect(ad,5)
}