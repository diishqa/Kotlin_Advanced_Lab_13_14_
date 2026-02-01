interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz : ProgressPrintable {
    override val progressText: String
        get() = "${aswered} of ${total} answered"

    override fun printProgressBar() {
        repeat(Quiz.aswered) { kotlin.io.print("▓") }
        repeat(Quiz.total - Quiz.aswered) { print("▓") }
        println()
        println(progressText)
    }

    val question1 = Question<String>(
        "Речка спятила с ума - По домам пошла сама. ___",
        "Водопровод",
        Difficulty.MEDIUM
    )
    val question2 = Question<Boolean>(
        "Небо зеленое. Правда или ложь",
        false,
        Difficulty.EASY
    )
    val question3 = Question<Int>(
        "Сколько дней между полнолуниями?",
        28,
        Difficulty.HARD
    )

    companion object StudentProgress {
        var total: Int=10
        var aswered: Int=3
    }
}

fun main() {
    Quiz().printProgressBar()




}