import java.lang.NumberFormatException
fun main()
{
    try{
    var p: Double
    var ch: Double
    var tr: Double
    var dv: Double
    var avg: Double
    var sum: Double
    println("Введите количество пятёрок:")
    p = readln()!!.toDouble()
    while (p < 0)
    {
        println("Количество не может быть меньше 0")
        println("Введите количество пятёрок:")
        p = readln()!!.toDouble()
    }
    println("Введите количество четвёрок:")
    ch = readln()!!.toDouble()
    while (ch < 0)
    {
        println("Количество не может быть меньше 0")
        println("Введите количество четвёрок:")
        ch = readln()!!.toDouble()
    }
    println("Введите количество троек:")
    tr = readln()!!.toDouble()
    while (tr < 0)
    {
        println("Количество не может быть меньше 0")
        println("Введите количество троек:")
        tr = readln()!!.toDouble()
    }
    println("Введите количество двоек:")
    dv = readln()!!.toDouble()
    while (dv < 0)
    {
        println("Количество не может быть меньше 0")
        println("Введите количество двоек:")
        dv = readln()!!.toDouble()
    }
    sum = 5.0*p+4.0*ch+3.0*tr+2.0*dv
    avg = (sum/(p+ch+tr+dv))
    sum = 0.0
    when
    {
        5 > avg && 4 < avg && 3 < avg && 2 < avg -> sum = sum + p
        5 > avg && 4 > avg && 3 < avg && 2 < avg -> sum = sum + p + ch
        5 > avg && 4 > avg && 3 > avg && 2 < avg -> sum = sum + p + ch+ tr
        5 > avg && 4 > avg && 3 > avg && 2 > avg -> sum = sum + p + ch+ tr + dv
    }
    println("Количество учеников, средний балл которых больше $avg: $sum")
}catch(e:NumberFormatException)
{
    println("Неверный формат ввода")
}}