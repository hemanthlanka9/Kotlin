fun main()
{
    println("Enter the first number:")
    var num1=readln().toInt()
    println("Enter the second number:")
    var num2=readln().toInt()
    var result=add(num1,num2)
    println("The result of $num1 + $num2 is $result.")
}

fun add(num1:Int,num2:Int):Int{
    return num1+num2
}