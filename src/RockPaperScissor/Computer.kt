package RockPaperScissor

class Computer: IGamer {
    private val selectedNumber: Int = java.util.Random().nextInt(3)

    override fun getSelection(): String {
        return selections[selectedNumber]
    }
}