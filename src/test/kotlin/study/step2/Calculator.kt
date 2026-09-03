package study.step2

class Calculator {
    fun calculate(input: String?): Double {
        val tokens = tokenize(input)
        var result = parseNumber(tokens.first())

        for (index in 1 until tokens.size step 2) {
            result = calculate(tokens, index, result)
        }

        return result
    }

    private fun tokenize(input: String?): List<String> {
        require(!input.isNullOrBlank()) { "입력값은 비어 있을 수 없습니다." }

        return input.trim().split(Regex("\\s+"))
    }

    private fun calculate(
        tokens: List<String>,
        operatorIndex: Int,
        result: Double,
    ): Double {
        require(operatorIndex + 1 < tokens.size) { "연산자와 피연산자는 쌍으로 입력해야 합니다." }

        val operatorSymbol = tokens[operatorIndex]
        val operand = parseNumber(tokens[operatorIndex + 1])

        return when (operatorSymbol) {
            "+" -> result + operand
            "-" -> result - operand
            "*" -> result * operand
            "/" -> divide(result, operand)
            else -> throw IllegalArgumentException("지원하지 않는 연산자입니다: $operatorSymbol")
        }
    }

    private fun parseNumber(value: String): Double =
        value.toDoubleOrNull()
            ?: throw IllegalArgumentException("숫자가 아닌 값입니다: $value")

    private fun divide(
        dividend: Double,
        divisor: Double,
    ): Double {
        require(divisor != 0.0) { "0으로 나눌 수 없습니다." }

        return dividend / divisor
    }
}
