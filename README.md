# kotlin-racingcar

## 현재 구현 현황

- [Step 1] 코틀린 학습 테스트: [Issue #1](https://github.com/jaeyeonme/kotlin-racingcar/issues/1) · [PR #2](https://github.com/jaeyeonme/kotlin-racingcar/pull/2) — 완료
- [Step 2] 문자열 계산기 구현: [Issue #3](https://github.com/jaeyeonme/kotlin-racingcar/issues/3) · [PR #4](https://github.com/jaeyeonme/kotlin-racingcar/pull/4) — 구현 완료 · 리뷰 중

## 과거 제출 이력

아래 내용은 NEXTSTEP에서 이전에 제출하고 코드 리뷰를 받은 기록이다. 현재 `main`의 구현 현황을 나타내지 않는다.

- [Step 1 코드 리뷰](https://github.com/next-step/kotlin-racingcar/pull/1279)
- [Step 2 코드 리뷰](https://github.com/next-step/kotlin-racingcar/pull/1297)
- [Step 3 코드 리뷰](https://github.com/next-step/kotlin-racingcar/pull/1375)
- [Step 4 코드 리뷰](https://github.com/next-step/kotlin-racingcar/pull/1442)
- [Step 5 코드 리뷰](https://github.com/next-step/kotlin-racingcar/pull/1478)

### Step 2 - 사칙연산 계산기

- [x] 덧셈, 뺄셈, 곱셈, 나눗셈
- [x] null 또는 빈 공백 입력과 잘못된 연산자에 대한 예외 처리
- [x] 사칙연산을 포함하는 문자열 계산기

### Step 3 - 자동차 경주

- [x] 자동차 수와 시도 횟수 입력
- [x] 0~9의 무작위 값이 4 이상일 때 전진
- [x] 자동차 상태 출력과 UI·핵심 로직 분리

### Step 4 - 자동차 경주(우승자)

- [x] 자동차 이름과 5자 제한
- [x] 쉼표로 구분한 이름 입력
- [x] 공동 우승자 출력

### Step 5 - 자동차 경주(리팩터링)

- [x] `domain`과 `view` 패키지 분리
- [x] `view`가 `domain`에만 의존하도록 MVC 방향으로 리팩터링
