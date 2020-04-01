import kotlin.math.pow


fun main(){
    var d0:Double=0.0
    var d1:Double=0.0
    var d2:Double=1.0

    while(d2<10){
        if((d2.pow(3)+d1.pow(3)+d0.pow(3))==(d2*100+d1*10+d0)){
            println(d2.toInt()*100+d1.toInt()*10+d0.toInt())
        }
        d0++
        if(d0==10.0){
            d0=0.0
            d1+=1
        }
        if(d1==10.0){
            d1=0.0
            d2+=1
        }
    }
}