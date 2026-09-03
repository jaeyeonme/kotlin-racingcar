package study.step3.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarTest {
    @Test
    fun `무작위 값이 4 이상이면 전진한다`() {
        val car = Car(CarName("pobi"))

        car.move(4)

        assertThat(car.position).isEqualTo(1)
    }

    @Test
    fun `무작위 값이 4 미만이면 전진하지 않는다`() {
        val car = Car(CarName("pobi"))

        car.move(3)

        assertThat(car.position).isZero()
    }
}
