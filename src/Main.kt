class Quiz {
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

val Quiz.StudentProgress.progressText: String
    get()="${aswered} of ${total} answered"

fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.aswered) { print("▓") }
    repeat(Quiz.total - Quiz.aswered) { print("▓") }
    println()
    println(Quiz.progressText)
}

fun main() {
    Quiz.printProgressBar()




}