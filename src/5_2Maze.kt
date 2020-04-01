import java.util.*

fun main(){
    val maze= Maze(arrayOf(intArrayOf(2,2,2,2,2,2,2), intArrayOf(0,0,0,0,0,0,2), intArrayOf(2,0,2,0,2,0,2), intArrayOf(2,0,0,2,0,2,2),
        intArrayOf(2,2,0,2,0,2,2), intArrayOf(2,0,0,0,0,0,2), intArrayOf(2,2,2,2,2,0,2)))

    maze.move(1,0)

    for(step in maze.steps){
        maze.maze[step.x][step.y]=1
    }
    println(maze)



}

class Step(val x:Int,val y:Int){
    fun equals(other:Step): Boolean {
        return if(this.x==other.x && this.y==other.y) return true else false
    }
}
class Maze(val maze:Array<IntArray>){
    val steps= Stack<Step>()
    fun move(x:Int, y:Int):Boolean{
        if(x==6 && y==5){
            steps.push(Step(x,y))
            return true
        }
        if(maze[x][y]==2 || steps.contains(Step(x,y))){
            return false
        }
        steps.push(Step(x,y))
        if(move(x+1,y)) return true
        if(move(x,y+1)) return true
        if(move(x-1,y)) return true
        if(move(x,y-1)) return true
        steps.pop()
        return false
    }


    override fun toString(): String {
        var graph=""
        for(row in maze){
            for(element in row){
                when(element){
                    1 -> graph=graph.plus("\u2b28")
                    2 -> graph=graph.plus("\u2588")
                    else -> graph=graph.plus("  ")
                }

            }
            graph=graph.plus("\n")
        }
        return graph
    }

}
