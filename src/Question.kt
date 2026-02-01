class Question<T>(
    val questionText: String,
    val answer: T,
    val difficultly: Difficulty
)

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}