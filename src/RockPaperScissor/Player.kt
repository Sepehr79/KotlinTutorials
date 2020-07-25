package RockPaperScissor

class Player: IGamer {
    var select: Int = -1;

    override fun getSelection(): String {
        return selections[select];
    }
}