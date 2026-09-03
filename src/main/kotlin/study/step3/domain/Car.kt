package study.step3.domain

class Car(
    val name: CarName,
) {
    var position: Int = INITIAL_POSITION
        private set

    fun move(randomValue: Int) {
        if (randomValue >= MOVE_THRESHOLD) {
            position++
        }
    }

    private companion object {
        const val INITIAL_POSITION = 0
        const val MOVE_THRESHOLD = 4
    }
}
