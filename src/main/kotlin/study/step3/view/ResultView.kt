package study.step3.view

import study.step3.dto.RaceOutput

object ResultView {
    fun display(raceOutput: RaceOutput) {
        println("실행 결과")

        raceOutput.positionHistory.forEach { statuses ->
            statuses.forEach { status -> println("${status.name} : ${"-".repeat(status.position)}") }
            println()
        }

        println("최종 우승자 : ${raceOutput.winnerNames.joinToString(", ")}")
    }
}
