//https://www.callicoder.com/kotlin-variables-data-types/
//https://kotlinlang.org/docs/tutorials/kotlin-for-py/loops.html

fun main(args: Array <String>): Unit {

    val myCharArray  = charArrayOf('K', 'O', 'T')

    val myIntArray = intArrayOf(1, 2 ,3, 4)

    for(myChar in myCharArray) {
        println(myChar)
    }

    for(myInt in myIntArray) {
        println(myInt)
    }

}