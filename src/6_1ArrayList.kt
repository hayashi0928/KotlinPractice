fun main(){
    var list=ArrayList<String>()
    var list2=ArrayList<String>()


    list.add("John")
    list.add("Mary")
    list.add("Chris")
    list2.add("John")
    list2.add("Mary")
    list2.add("Chris")

    println(list.equals(list2))


}

/*fun ArrayList<String>.equals(array2:ArrayList<String>):Boolean{
    if(this.size!= array2.size){
        return false
    }
    for(i:Int in 0..this.size){
        println(this.get(i))
        if(this[i]!=array2[i]){

            return false
        }
    }
    return true
}*/