# Kotlin Racing Car

[NEXTSTEP 자동차 경주 미션](https://github.com/next-step/kotlin-racingcar)을 Kotlin으로 구현한 콘솔 애플리케이션입니다. 자동차 이름과 시도 횟수를 입력하면 무작위 값에 따라 자동차가 전진하고, 각 시도의 위치와 최종 우승자를 출력합니다.

## 주요 기능

- 쉼표로 구분한 자동차 이름과 1 이상의 시도 횟수를 입력받습니다.
- 자동차 이름은 1자 이상 5자 이하이며, 공백만으로 구성할 수 없습니다.
- 각 자동차는 0부터 9까지의 무작위 값이 4 이상이면 한 칸 전진합니다.
- 가장 멀리 전진한 자동차를 우승자로 판정하며, 최고 위치가 같으면 모두 공동 우승자가 됩니다.

## 설계

### 난수 생성 로직 분리

`Race`는 이동 판단에 사용할 값을 `RandomNumberGenerator`에서 받습니다. 실행에서는 무작위 값을 사용하고, 테스트에서는 값을 지정해 전진·정지와 우승자 판정을 확인합니다. 관련 동작은 [RaceTest](src/test/kotlin/study/step3/domain/RaceTest.kt)에서 확인할 수 있습니다.

### 자동차 이름 규칙을 `CarName`에서 검증

자동차 이름의 길이와 공백 규칙은 `CarName` 생성 시점에 검증합니다. `Car`는 문자열 대신 `CarName`을 사용하므로 유효하지 않은 이름을 가진 자동차가 생성되는 것을 막습니다. 경계 조건은 [CarNameTest](src/test/kotlin/study/step3/domain/CarNameTest.kt)에서 확인할 수 있습니다.

### `RaceResult`와 출력 데이터 분리

애플리케이션은 `RaceResult`를 출력에 필요한 `RaceOutput`으로 변환해 `ResultView`에 전달합니다.

출력용 타입과 변환 코드가 추가되지만, `ResultView`는 `domain` 패키지 타입을 직접 사용하지 않습니다.

## 테스트

전체 테스트와 코드 스타일은 다음 명령으로 확인합니다.

```shell
./gradlew clean test ktlintCheck
```

## 개발 기록

단계별 변경 내용은 Issue와 PR에 기록했습니다.

| 단계 | 내용 | 기록 |
| --- | --- | --- |
| Step 1 | Kotlin 학습 테스트 | [Issue #1](https://github.com/jaeyeonme/kotlin-racingcar/issues/1) · [PR #2](https://github.com/jaeyeonme/kotlin-racingcar/pull/2) |
| Step 2 | 학습용 문자열 계산기 | [Issue #3](https://github.com/jaeyeonme/kotlin-racingcar/issues/3) · [PR #4](https://github.com/jaeyeonme/kotlin-racingcar/pull/4) |
| Step 3 | 자동차 경주 | [Issue #5](https://github.com/jaeyeonme/kotlin-racingcar/issues/5) · [PR #6](https://github.com/jaeyeonme/kotlin-racingcar/pull/6) |
| Step 4 | 자동차 이름과 우승자 | [Issue #7](https://github.com/jaeyeonme/kotlin-racingcar/issues/7) · [PR #8](https://github.com/jaeyeonme/kotlin-racingcar/pull/8) |
| Step 5 | 출력 데이터 분리 | [Issue #9](https://github.com/jaeyeonme/kotlin-racingcar/issues/9) · [PR #10](https://github.com/jaeyeonme/kotlin-racingcar/pull/10) |

## 실행 방법

JDK 25 환경에서 실행합니다.

```shell
./gradlew run
```

쉼표로 구분한 자동차 이름과 시도 횟수를 차례대로 입력합니다. 경주 결과는 무작위 값에 따라 달라질 수 있습니다.
