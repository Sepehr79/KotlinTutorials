package RockPaperScissor

import java.util.*

/**
 * @author Sepehr79
 * this program is simple game
 *
 * inputs must be r/rock , p/paper, s/scissor
 */
class Gamer {
    private val selections: Array<String> = arrayOf("Rock", "Paper", "Scissor")
    private val selectedNumber: Int = Random().nextInt(3)

    var select: Int = -1
        set(num){
            if (num in 0..2)
                field = num
        }

    fun getSelection(): String{
        if(select == -1)
            return selections[selectedNumber]
        else
            return selections[select]
    }
}