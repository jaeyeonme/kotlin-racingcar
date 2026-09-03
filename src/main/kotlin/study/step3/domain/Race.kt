package study.step3.domain

class Race(
    val cars: List<Car>,
    private val randomNumberGenerator: RandomNumberGenerator,
) {
    init {
        require(cars.isNotEmpty()) { "자동차는 한 대 이상이어야 합니다." }
    }

    fun run(attemptCount: Int): List<List<Int>> {
        require(attemptCount > 0) { "시도 횟수는 1 이상이어야 합니다." }

        return List(attemptCount) {
            moveCars()
            cars.map(Car::position)
        }
    }

    private fun moveCars() {
        cars.forEach { car -> car.move(randomNumberGenerator.generate()) }
    }
}
