//Вывод символов: Напишите программу, которая выводит символы
//строки по одному, используя циклы.
fun main(){
    println("строка: ")
    var a = readLine()
    for (i in 0..a!!.length - 1 ) println(a[i])
}