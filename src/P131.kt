import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.PrintWriter
import java.net.ServerSocket

fun main(){
    Echoserver.echo()
}

class Echoserver(){
    companion object{
        fun echo(): Unit {
            try{
                var ss=ServerSocket(8885)
                var socket =ss.accept()
                var output=PrintWriter(socket.getOutputStream())
                var input=BufferedReader(InputStreamReader(socket.getInputStream()))
                var data=input.readLine()
                println("收到：${data}")
                output.println(data)
                output.flush()
                println("送出：${data}")
            }catch (e:IOException){
                println("輸出入錯誤")
            }
        }

    }
}