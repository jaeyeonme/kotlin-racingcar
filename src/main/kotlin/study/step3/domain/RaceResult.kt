package study.step3.domain

data class RaceResult(
    val positionHistory: List<List<CarStatus>>,
    val winnerNames: List<String>,
)
