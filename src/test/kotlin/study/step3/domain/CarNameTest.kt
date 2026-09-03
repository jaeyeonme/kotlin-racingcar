package study.step3.domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.junit.jupiter.api.Test

class CarNameTest {
    @Test
    fun `1자 이상 5자 이하의 자동차 이름을 생성한다`() {
        val carName = CarName("pobi")

        assertThat(carName.value).isEqualTo("pobi")
    }

    @Test
    fun `빈 자동차 이름을 생성할 수 없다`() {
        assertThatIllegalArgumentException().isThrownBy { CarName("") }
    }

    @Test
    fun `공백뿐인 자동차 이름을 생성할 수 없다`() {
        assertThatIllegalArgumentException().isThrownBy { CarName("   ") }
    }

    @Test
    fun `6자 이상의 자동차 이름을 생성할 수 없다`() {
        assertThatIllegalArgumentException().isThrownBy { CarName("racing") }
    }
}
