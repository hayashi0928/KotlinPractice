fun main(){
    var recordA=Log("John",0)
    var name=recordA.name
    name="Steven"
    println(recordA.name)
}

class Log(var name:String,var number:Int){

}