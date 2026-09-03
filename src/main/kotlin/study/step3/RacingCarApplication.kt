package study.step3

import study.step3.domain.Car
import study.step3.domain.Race
import study.step3.domain.RandomNumberGenerator
import study.step3.dto.RaceOutput
import study.step3.dto.RacingCarState
import study.step3.view.InputView
import study.step3.view.ResultView
import kotlin.random.Random

fun main() {
    val carNames = InputView.readCarNames()
    val attemptCount = InputView.readAttemptCount()
    val cars = carNames.map(::Car)
    val randomNumberGenerator = RandomNumberGenerator { Random.nextInt(FIRST_RANDOM_VALUE, LAST_RANDOM_VALUE_EXCLUSIVE) }
    val race = Race(cars, randomNumberGenerator)
    val raceResult = race.run(attemptCount)
    val raceOutput =
        RaceOutput(
            positionHistory =
                raceResult.positionHistory.map { statuses ->
                    statuses.map { status -> RacingCarState(status.name, status.position) }
                },
            winnerNames = raceResult.winnerNames,
        )

    ResultView.display(raceOutput)
}

private const val FIRST_RANDOM_VALUE = 0
private const val LAST_RANDOM_VALUE_EXCLUSIVE = 10
