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
    fun printQuiz() {
        question1.let {
            println((it.questionText))
            println(it.answer)
            println(it.difficultly)
        }
        println()
        question2.let {
            println((it.questionText))
            println(it.answer)
            println(it.difficultly)
        }
        println()
        question3.let {
            println((it.questionText))
            println(it.answer)
            println(it.difficultly)
        }
        println()
    }



}

fun main() {
//    Quiz().printProgressBar()
//    Quiz().apply { printQuiz() }
//    println(solarSystem[0])
//    println(solarSystem[1])
//    println(solarSystem[2])
//    println(solarSystem[3])
//    println(solarSystem[4])
//    println(solarSystem[5])
//    println(solarSystem[6])
//    println(solarSystem[7])
//    solarSystem[3]="Little Earth"
//    println(solarSystem[3])
//    val newSolarSystem = arrayOf(
//        "Mercury",
//        "Venus",
//        "Earth",
//        "Mars",
//        "Jupiter",
//        "Saturn",
//        "Uranus",
//        "Neptune",
//        "Pluto"
//    )

    val solarSystem= mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add("Pluto")
    solarSystem.add(3, "Theia")
    solarSystem[3]="Future Moon"
    println(solarSystem[3])
    println(solarSystem[9])
    solarSystem.removeAt(9)
    println(solarSystem.contains("Pluto"))
    println("Future Moon" in solarSystem)
//    println(solarSystem.size)
//    println(solarSystem[2])
//    println(solarSystem.get(3))
//    println(solarSystem.indexOf("Earth"))
//    println(solarSystem.indexOf("Pluto"))
//    for (planet in solarSystem){
//        println(planet)
//    }




}