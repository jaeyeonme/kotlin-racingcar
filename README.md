# kotlin-racingcar

## [step2] - 사칙연산 계산기
### 기능 요구 사항
- [x] 덧셈
- [x] 뺄셈
- [x] 곱셈
- [x] 나눗셈
- [x] 입력값이 null이거나 빈 공백 문자일 경우 `IllegalArgumentException throw`
- [x] 사칙연산 기호가 아닌 경우 `IllegalArgumentException throw`
- [x] 사칙 연산을 모두 포함하는 기능 구현

<br>

## [step3] - 자동차 경주
### 기능 요구 사항
- [x] 사용자는 몇 대의 자동차로 경주할 것인지 입력할 수 있다.
- [x] 사용자는 몇 번의 이동을 할 것인지 입력할 수 있다.
- [x] n대의 자동차는 전진 또는 정지할 수 있다.
  - [x] 0~9 사이의 랜덤 값이 4 이상이면 전진한다.
  - [x] 0~9 사이의 랜덤 값이 4 미만이면 정지한다.
- [x] 자동차의 상태를 화면에 출력한다.
- [x] 모든 로직에 단위 테스트를 구현한다. (단, UI(System.out, System.in) 로직은 제외)
- [x] 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
- [x] UI 로직을 `InputView`, `ResultView`와 같은 클래스를 추가해 분리한다.

<br>

## [step4] - 자동차 경주 (우승자)
### 기능 요구 사항
- [x] 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
- [x] 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- [x] 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- [x] 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
- [x] 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
- [x] 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
- [x] UI 로직을 `InputView`, `ResultView`와 같은 클래스를 추가해 분리한다.

<br>

## [step5] - 자동차 경주 (리팩토링)
### 요구 사항
- [x] 핵심 비지니스 로직을 가지는 객체를 domain 패키지, UI 관련한 객체를 view 패키지에 구현한다.
- [x] MVC 패턴 기반으로 리팩토링해 view 패키지의 객체가 domain 패키지 객체에 의존할 수 있지만, domain 패키지의 객체는 view 패키지 객체에 의존하지 않도록 구현한다.


<br>

## 각 단계별 코드 리뷰
- [step1 - 코드리뷰](https://github.com/next-step/kotlin-racingcar/pull/1279)
- [step2 - 코드리뷰](https://github.com/next-step/kotlin-racingcar/pull/1297)
- [step3 - 코드리뷰](https://github.com/next-step/kotlin-racingcar/pull/1375)
- [step4 - 코드리뷰](https://github.com/next-step/kotlin-racingcar/pull/1442)
- [step5 - 코드리뷰](https://github.com/next-step/kotlin-racingcar/pull/1478)
