import kotlin.random.Random
fun main(){
    var arr = Array<Int>(10, { Random.nextInt(-50, 50)})
    println("Ваш чунга: ${arr.joinToString(", ")}\nВыберете чунгу из данного массива:")
    var select = readln().toInt()
    arr.forEachIndexed{index, element ->
        if (element == select) println("Это $index элемент чунги")
    }

}