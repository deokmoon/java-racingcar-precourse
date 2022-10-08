package racingcar.exception;

public class InputMoveCountExceedException extends IllegalArgumentException {
    public InputMoveCountExceedException() {
        super("입력할 수 있는 숫자는 최대 4자리입니다.");
    }
}
