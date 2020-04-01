fun main(){
    val number= intArrayOf(70,80,31,37,10,1,48,60,33)
    number.sort()
    for(e in number){
        print("$e ")
    }
    val element= try { readLine()?.toInt()}catch(ex:NumberFormatException){ return }
    if(element==-1){
        print("No element")
    }else {
        print("index=${number.indexOf(element!!) + 1}\n")
    }

}