fun main() {
    print("Введите элементы чунги разделенных пробелами: ")
    val list = readLine()!!.split(" ").map { it.toInt() }
    println(list.joinToString(", "))
}