import java.net.InetAddress

fun main(){
    var addr=InetAddress.getAllByName("google.com.tw")
    for(add in addr)
        println("${add.hostName}  ${add.hostAddress}")
}