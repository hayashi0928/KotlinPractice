
fun main(){
    var m:Int=1000
    var n:Int=495
    var x:Int=2
    var hcf:Int=1
    while(x<n){
        if( m%x==0 && n%x==0 ){
            hcf*=x
            m/=x
            n/=x
        }
        x++
    }
    println("最大公因數=$hcf")
}