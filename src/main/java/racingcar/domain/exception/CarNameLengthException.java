package racingcar.domain.exception;

public class CarNameLengthException extends IllegalArgumentException {
    public CarNameLengthException() {
        super("자동차의 이름은 5글자 이하로 입력해야 합니다.");
    }
}
