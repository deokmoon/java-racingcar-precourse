package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarNameTest {
    @DisplayName("자동차이름 원시값 객체 생성을 통해 원시값이 포장되는지 확인")
    @Test
    public void 자동차이름_원시값_포장_확인() {
        // given // when
        CarName carName = new CarName("hello");
        // then
        assertThat(carName.getCarName()).isEqualTo("hello");
    }

    @DisplayName("자동차 이름의 길이가 5 초과인 경우 예외 발생")
    @Test
    public void 자동차_이름의_길이가_5_초과인_경우_예외발생() {
        // given
        String carName = "santafe";
        // when
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new CarName(carName));
        // then
        assertEquals(exception.getMessage(), "자동차의 이름은 5글자 이하로 입력해야 합니다.");
    }
}
