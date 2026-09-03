package study.step3.view

import study.step3.domain.CarName

object InputView {
    fun readCarNames(): List<CarName> {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")

        return readln().split(",").map(::CarName)
    }

    fun readAttemptCount(): Int = readInt("시도할 횟수는 몇 회인가요?")

    private fun readInt(message: String): Int {
        println(message)

        return readln().toInt()
    }
}
