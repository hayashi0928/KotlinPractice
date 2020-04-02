import java.net.NetworkInterface

fun main(){
    var workinterface=NetworkInterface.getNetworkInterfaces()
    while(workinterface.hasMoreElements() ){
        var ni=workinterface.nextElement()
        print("$ni.name  ${ni.isUp}\n")
    }
}