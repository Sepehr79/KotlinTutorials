package RockPaperScissor

fun main(args: Array<String>){
    val player: Player = Player()
    val computer: Computer = Computer()

    var input: String = readLine()!!.toString()

    when(input){
        "r", "rock", "R", "Rock" -> player.select = 0
        "p", "paper", "P", "Paper" -> player.select = 1
        "s", "scissor", "S", "Scissor" -> player.select = 2
    }

    try {
        val winner: IGamer? = getWinner(player, computer)
        println("Your Selection: ${player.getSelection()}\nComputer Selection: ${computer.getSelection()}")

        if (winner is Player) {
            println("You Win!")
        }
        else if (winner is Computer)
            println("You Lose!")
        else
            println("You Draw")
    }
    catch (e: Exception){
        println("Wrong Choice!")
    }

}

fun getWinner(player: IGamer, computer: IGamer): IGamer?{
    when{
        player.getSelection() == "Rock" && computer.getSelection() == "Paper" -> return computer
        player.getSelection() == "Rock" && computer.getSelection() == "Scissor" -> return player
        player.getSelection() == "Paper" && computer.getSelection() == "Rock" -> return player
        player.getSelection() == "Paper" && computer.getSelection() == "Scissor" -> return computer
        player.getSelection() == "Scissor" && computer.getSelection() == "Paper" -> return player
        player.getSelection() == "Scissor" && computer.getSelection() == "Rock" -> return computer
        else -> return null
    }
}