package racingcar.exception;

public class CarNameDuplicateException extends IllegalArgumentException {
    public CarNameDuplicateException() {
        super("게임에 참가하는 자동차의 이름은 중복 허용이 안됩니다.");
    }
}
