package racingcar.exception;

public class GameParticipantIllegalException extends IllegalArgumentException {
    public GameParticipantIllegalException() {
        super("게임에 참가하는 자동차는 2대 이상이어야 합니다.");
    }
}
