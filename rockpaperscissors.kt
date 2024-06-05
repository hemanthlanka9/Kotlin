fun main(){
    var computerChoice=""
    var playerChoice=""
    println("Rock, Paper or Scissors? Enter your choice:")
    playerChoice=readln()
    while(playerChoice!="Rock" && playerChoice!="Paper" && playerChoice!="Scissors"){
        println("Given wrong input, please enter correct choice!")
        playerChoice= readln()
    }
    val randomNumber=(1..3).random()
    if(randomNumber==1){
        computerChoice="Rock"
    }
    else if(randomNumber==2){
        computerChoice="Paper"
    }
    else{
        computerChoice="Scissors"
    }
    println("Player Choice: "+playerChoice)
    println("Computer Choice: "+computerChoice)

    var winner=when{
        playerChoice==computerChoice-> "Tie"
        playerChoice=="Rock" && computerChoice=="Scissors"-> "Player"
        playerChoice=="Paper" && computerChoice=="Rock"-> "Player"
        playerChoice=="Scissors" && computerChoice=="Paper"-> "Player"
        else->"Computer"
    }
    if(winner=="Tie"){
        println("Its a Tie!")
    }
    else{
        println("$winner won.")
    }
}