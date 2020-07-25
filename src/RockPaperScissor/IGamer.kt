package RockPaperScissor

interface IGamer {
    val selections: Array<String>
        get() = arrayOf("Rock", "Paper", "Scissor")

    fun getSelection(): String
}