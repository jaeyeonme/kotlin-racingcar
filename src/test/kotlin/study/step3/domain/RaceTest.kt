package study.step3.domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.junit.jupiter.api.Test

class RaceTest {
    @Test
    fun `자동차가 없으면 경주를 생성할 수 없다`() {
        assertThatIllegalArgumentException().isThrownBy {
            Race(emptyList(), RandomNumberGenerator { 4 })
        }
    }

    @Test
    fun `각 시도에서 자동차의 위치 이력을 반환한다`() {
        val race =
            Race(
                cars = List(2) { Car() },
                randomNumberGenerator = RandomNumberGenerator { 4 },
            )

        val positionHistory = race.run(3)

        assertThat(positionHistory).containsExactly(
            listOf(1, 1),
            listOf(2, 2),
            listOf(3, 3),
        )
        assertThat(race.cars.map(Car::position)).containsExactly(3, 3)
    }

    @Test
    fun `시도 횟수가 0이면 경주를 실행할 수 없다`() {
        val race =
            Race(
                cars = listOf(Car()),
                randomNumberGenerator = RandomNumberGenerator { 4 },
            )

        assertThatIllegalArgumentException().isThrownBy { race.run(0) }
    }
}
