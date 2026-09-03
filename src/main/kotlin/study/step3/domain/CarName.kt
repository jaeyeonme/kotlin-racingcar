package study.step3.domain

class CarName(
    val value: String,
) {
    init {
        require(value.isNotBlank() && value.length <= MAX_LENGTH) { "자동차 이름은 1자 이상 5자 이하여야 합니다." }
    }

    private companion object {
        const val MAX_LENGTH = 5
    }
}
