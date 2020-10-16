import java.io.IOException
import java.io.PrintWriter
import java.net.ServerSocket
import java.util.*

fun main() {
    Timeserver.report()
}

class Timeserver(){
    companion object{
        fun report(){
            try{
                var ss= ServerSocket(8886);
                var date=Calendar.getInstance().getTime()
                var socket=ss.accept()
                var out=PrintWriter(socket.getOutputStream())

                out.println(date)
                out.flush()
                out.close()
                socket.close()
                ss.close()
            }catch (e:IOException){
                println("輸出入錯誤！")
            }
        }
    }

}