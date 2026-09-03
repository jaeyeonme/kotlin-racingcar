package study.step2

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.NullAndEmptySource
import org.junit.jupiter.params.provider.ValueSource

class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun `사칙연산을 계산한다`() {
        assertThat(calculator.calculate("1 + 2")).isEqualTo(3.0)
        assertThat(calculator.calculate("5 - 2")).isEqualTo(3.0)
        assertThat(calculator.calculate("2 * 3")).isEqualTo(6.0)
        assertThat(calculator.calculate("6 / 2")).isEqualTo(3.0)
    }

    @Test
    fun `입력된 순서대로 계산한다`() {
        assertThat(calculator.calculate("2 + 3 * 4 / 2")).isEqualTo(10.0)
    }

    @Test
    fun `소수 결과를 유지한다`() {
        assertThat(calculator.calculate("5 + 2 / 2")).isEqualTo(3.5)
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = [" ", "  "])
    fun `null 또는 공백 입력은 예외가 발생한다`(input: String?) {
        assertThatThrownBy { calculator.calculate(input) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @ParameterizedTest
    @ValueSource(strings = ["number + 2", "1 + number"])
    fun `숫자가 아닌 피연산자는 예외가 발생한다`(input: String) {
        assertThatThrownBy { calculator.calculate(input) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @Test
    fun `지원하지 않는 연산자는 예외가 발생한다`() {
        assertThatThrownBy { calculator.calculate("1 % 2") }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @Test
    fun `0으로 나누면 예외가 발생한다`() {
        assertThatThrownBy { calculator.calculate("1 / 0") }
            .isInstanceOf(IllegalArgumentException::class.java)
    }
}
