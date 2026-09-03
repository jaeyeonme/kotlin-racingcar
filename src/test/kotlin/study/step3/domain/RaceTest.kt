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
                cars = listOf(Car(CarName("pobi")), Car(CarName("woni"))),
                randomNumberGenerator = RandomNumberGenerator { 4 },
            )

        val raceResult = race.run(3)

        assertThat(raceResult.positionHistory).containsExactly(
            listOf(CarStatus("pobi", 1), CarStatus("woni", 1)),
            listOf(CarStatus("pobi", 2), CarStatus("woni", 2)),
            listOf(CarStatus("pobi", 3), CarStatus("woni", 3)),
        )
        assertThat(raceResult.winnerNames).containsExactly("pobi", "woni")
    }

    @Test
    fun `시도 횟수가 0이면 경주를 실행할 수 없다`() {
        val race =
            Race(
                cars = listOf(Car(CarName("pobi"))),
                randomNumberGenerator = RandomNumberGenerator { 4 },
            )

        assertThatIllegalArgumentException().isThrownBy { race.run(0) }
    }

    @Test
    fun `가장 멀리 전진한 자동차가 한 대면 단독 우승자다`() {
        val randomValues = listOf(4, 3).iterator()
        val race =
            Race(
                cars = listOf(Car(CarName("pobi")), Car(CarName("woni"))),
                randomNumberGenerator = RandomNumberGenerator { randomValues.next() },
            )

        val raceResult = race.run(1)

        assertThat(raceResult.winnerNames).containsExactly("pobi")
    }
}
