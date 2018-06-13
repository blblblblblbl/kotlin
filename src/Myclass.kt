fun main(args: Array<String>): Unit {

    val person=Player("Player")

        }

open class Player(var name: String, var dex:Int = 1, var str: Int = 1, var lvl:Int = 1, var maxHP:Int = 10,
                  var nextLvlXP: Int= 10, var XP:Int = 0, var HP:Int = 10){

    open fun lvlUp(){
        lvl+=1
        str += if (lvl % 2 == 0) 1 else 0
        dex += if (lvl % 2 == 1) 1 else 0
        maxHP = (maxHP*1.1).toInt()
        nextLvlXP *= 2
        HP = maxHP
        println ("Lvl up! Your stats are ${toString()}")
    }
    fun increaseXP(newXP : Int){
        println("Got ${newXP} XP")
        XP += newXP
        if (XP > nextLvlXP) lvlUp()
    }
    fun deathPenalty(){
        XP/=2
        HP=maxHP
    }

}
class Son:Player(name="vasya")
{
    override fun lvlUp() {
       println("nhbjk")
    }
}
open class Item(var s:Int){
   var lvlRequried:Int=90
    var strRequried:String="red"
    open fun method(){print("1")}

}
class Weapon:Item(s=5){
    override fun method() {
        super.method()
    }
}







