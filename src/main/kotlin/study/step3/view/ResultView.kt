package study.step3.view

import study.step3.domain.RaceResult

object ResultView {
    fun display(raceResult: RaceResult) {
        println("실행 결과")

        raceResult.positionHistory.forEach { statuses ->
            statuses.forEach { status -> println("${status.name} : ${"-".repeat(status.position)}") }
            println()
        }

        println("최종 우승자 : ${raceResult.winnerNames.joinToString(", ")}")
    }
}
