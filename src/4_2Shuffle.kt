import kotlin.random.Random

fun main(){
    val pokers=ArrayList<Poker>()
    for(n:Int in 0..51){
        pokers.add( Random.nextInt(pokers.size+1),Poker(when(n/13){0->"桃"; 1->"磚"; 2->"梅"; else->"心"},n%13+1))
    }
    println(pokers)
}
class Poker(flower:String,number:Int){
    val flower=flower
    val number=number
    override fun toString(): String {
        return flower.plus(number)
    }
}