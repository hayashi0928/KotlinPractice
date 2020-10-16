import java.io.InputStreamReader
import java.net.URL

fun main() {
    val url= URL("http","j.snpy.org","/net/index.html")
    val conn=url.openConnection()
    conn.connect()
    var type=conn.contentType
    println("內文格式:$type")
    var encoding=conn.contentEncoding
    println("編碼:$encoding")
    var input=InputStreamReader(conn.getInputStream(),encoding)
    var data=input.read()
    while(data!=-1){
        println(data.toChar())
    }
    input.close()
}