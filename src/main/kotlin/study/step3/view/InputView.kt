package study.step3.view

object InputView {
    fun readCarCount(): Int = readInt("자동차 대수는 몇 대인가요?")

    fun readAttemptCount(): Int = readInt("시도할 횟수는 몇 회인가요?")

    private fun readInt(message: String): Int {
        println(message)

        return readln().toInt()
    }
}
