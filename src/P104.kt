import java.io.IOException
import java.net.Socket
import java.net.UnknownHostException

fun main(){
    try{
        var socket= Socket("localhost",23)
        println("連線成功")
    }catch(ex:UnknownHostException){
        println("主傳連線失敗")
    }catch(ex:IOException){
        println("轉輸失敗")
    }


}