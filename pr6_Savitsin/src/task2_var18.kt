import java.lang.NumberFormatException
fun main()
{
    try {var num: Int
    println("Введите число")
    num = readln()!!.toInt()
    when
    {
        num<0 && num%2==0 -> println("$num - отрицательное четное число")
        num<0 && num%2!=0 -> println("$num - отрицательное нечетное число")
        num==0 -> println("$num - нулевое число")
        num>0 && num%2==0 -> println("$num - положительное четное число")
        num>0 && num%2!=0 -> println("$num - положительное нечетное число")
    }
}catch(e:NumberFormatException)
{
    println("Неверный формат записи")
}}