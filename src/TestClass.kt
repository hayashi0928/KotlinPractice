package testclass

fun printout(cont:String){
        print(cont)
}
open class Log(name: String,number:Int){
    var name: String=name
    var number:Int=number
    constructor(name: String):this(name,0)
    init {
        this.name="Steve"
    }

}

class Record(var itemnumber:Int,name: String,number: Int) :Log(name,number){

}