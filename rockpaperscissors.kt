fun main(){
    var computerChoice=""
    var playerChoice=""
    println("Rock, Paper or Scissors? Enter your choice:")
    playerChoice=readln()
    playerChoice=playerChoice.lowercase()
    while(playerChoice!="rock" && playerChoice!="paper" && playerChoice!="scissors"){
        println("Given wrong input, please enter correct choice!")
        playerChoice= readln()
    }
    val randomNumber=(1..3).random()
    if(randomNumber==1){
        computerChoice="rock"
    }
    else if(randomNumber==2){
        computerChoice="paper"
    }
    else{
        computerChoice="scissors"
    }
    println("Player Choice: "+playerChoice)
    println("Computer Choice: "+computerChoice)

    var winner=when{
        playerChoice==computerChoice-> "Tie"
        playerChoice=="rock" && computerChoice=="scissors"-> "Player"
        playerChoice=="paper" && computerChoice=="rock"-> "Player"
        playerChoice=="scissors" && computerChoice=="paper"-> "Player"
        else->"Computer"
    }
    if(winner=="Tie"){
        println("Its a Tie!")
    }
    else{
        println("$winner won.")
    }
}