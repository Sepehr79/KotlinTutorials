package RockPaperScissor

fun main(args: Array<String>){
    val player: Gamer = Gamer()
    val computer: Gamer = Gamer()

    var input: String = readLine()!!.toString()

    when(input){
        "r", "rock", "R", "Rock" -> player.select = 0
        "p", "paper", "P", "Paper" -> player.select = 1
        "s", "scissor", "S", "Scissor" -> player.select = 2
    }

    if(player.select != -1) {
        println("Your Selection: ${player.getSelection()}\nComputer Selection: ${computer.getSelection()}")
        printWinner(player, computer)
    }
    else
        println("Wrong input!")

}

fun printWinner(player: Gamer, computer: Gamer){
    when{
        player.getSelection() == "Rock" && computer.getSelection() == "Paper" -> println("You Lose!")
        player.getSelection() == "Rock" && computer.getSelection() == "Scissor" -> println("You Win!")
        player.getSelection() == "Paper" && computer.getSelection() == "Rock" -> println("You Win!")
        player.getSelection() == "Paper" && computer.getSelection() == "Scissor" -> println("You Lose!")
        player.getSelection() == "Scissor" && computer.getSelection() == "Paper" -> println("You Win!")
        player.getSelection() == "Scissor" && computer.getSelection() == "Rock" -> println("You Lose!")
        else -> println("You Draw!")
    }
}