package study.step3.domain

class Race(
    private val cars: List<Car>,
    private val randomNumberGenerator: RandomNumberGenerator,
) {
    init {
        require(cars.isNotEmpty()) { "자동차는 한 대 이상이어야 합니다." }
    }

    fun run(attemptCount: Int): RaceResult {
        require(attemptCount > 0) { "시도 횟수는 1 이상이어야 합니다." }

        val positionHistory =
            List(attemptCount) {
                moveCars()
                cars.map { car -> CarStatus(car.name.value, car.position) }
            }

        return RaceResult(positionHistory, findWinnerNames())
    }

    private fun moveCars() {
        cars.forEach { car -> car.move(randomNumberGenerator.generate()) }
    }

    private fun findWinnerNames(): List<String> {
        val maximumPosition = cars.maxOf(Car::position)

        return cars.filter { car -> car.position == maximumPosition }.map { car -> car.name.value }
    }
}
