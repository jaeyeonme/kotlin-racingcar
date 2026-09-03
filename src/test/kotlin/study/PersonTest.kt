package study

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun `이름 붙인 인자로 생성하면 전달한 값이 프로퍼티에 저장된다`() {
        val person = Person(name = "홍길동", age = 20, nickname = "홍")

        assertThat(person.name).isEqualTo("홍길동")
        assertThat(person.age).isEqualTo(20)
        assertThat(person.nickname).isEqualTo("홍")
    }

    @Test
    fun `nickname에 null을 명시적으로 전달할 수 있다`() {
        val person = Person(name = "홍길동", age = 20, nickname = null)

        assertThat(person.nickname).isNull()
    }

    @Test
    fun `nickname을 생략하면 name을 기본값으로 사용한다`() {
        val person = Person(name = "홍길동", age = 20)

        assertThat(person.nickname).isEqualTo("홍길동")
    }

    @Test
    fun `프로퍼티 값이 같은 두 Person은 동등하다`() {
        val firstPerson = Person(name = "홍길동", age = 20)
        val secondPerson = Person(name = "홍길동", age = 20)

        assertThat(firstPerson).isEqualTo(secondPerson)
    }
}
