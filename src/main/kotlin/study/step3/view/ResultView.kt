package study.step3.view

object ResultView {
    fun display(positionHistory: List<List<Int>>) {
        println("실행 결과")

        positionHistory.forEach { positions ->
            positions.forEach { position -> println("-".repeat(position)) }
            println()
        }
    }
}
