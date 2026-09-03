package study.step3.dto

data class RaceOutput(
    val positionHistory: List<List<RacingCarState>>,
    val winnerNames: List<String>,
)
