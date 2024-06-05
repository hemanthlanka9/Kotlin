fun main()
{
    print("Enter your age as a whole number: ")
    var age= readln().toInt()
    if(age in 18..39)
    {
        print("You can go into the club")
    }
    else if(age>=40)
    {
        println("You are too old to enter the club")
    }
    else{
        println("You are too young to enter the club")
    }

}