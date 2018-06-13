import java.util.*

fun main(args: Array<String>): Unit {
    var sum:Double=0.0
    for(i in 0 until args.size){
        sum+=args[i].toDouble()
    }
    println(sum)

    var arr = Array<Int>(10, {i: Int -> Random().nextInt()})
    for (i in arr){
        println(i)
    }


}