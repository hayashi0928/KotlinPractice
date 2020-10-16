import java.net.ServerSocket

fun main(){
    var ss=ServerSocket(8888)
    println("開始傾聽")
    ss.accept()
    println("已有客戶連線")
}