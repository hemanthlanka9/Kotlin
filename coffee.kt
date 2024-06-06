fun main()
{
    println("Enter your name:")
    val name=readln()
    println("Enter the no of spoons of sugar you want in coffee:")
    val sugar=readln().toInt()
    makeCoffee(sugar,name)
}

fun makeCoffee(sugar:Int,name:String)
{
    if (sugar==0)
    {
        print("Coffee with no sugar for $name!")
    }
    else if(sugar==1)
    {
        println("Coffee with $sugar spoon of sugar for $name!")
    }
    else{
        println("Coffee with $sugar spoons of sugar for $name!")
    }
}