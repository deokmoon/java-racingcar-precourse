package racingcar.utils;

import racingcar.exception.InputMoveCountIllegalArgumentException;

import java.util.Scanner;

import static racingcar.utils.RacingCarConstants.MAX_INPUT_MOVE_COUNT;
import static racingcar.utils.RacingCarConstants.MIN_INPUT_MOVE_COUNT;
import static racingcar.utils.RacingCarConstants.MSG_MOVE_COUNT_LENGTH_EXCEED_EXCEPTION;
import static racingcar.utils.RacingCarConstants.MSG_MOVE_MIN_VALUE_EXCEPTION;
import static racingcar.utils.RacingCarConstants.MSG_NUMBER_FORMAT_EXCEPTION;

public class InputMoveCount {
    public static int inputMoveCount() {
        Scanner sc = new Scanner(System.in);
        int moveCount;
        try {
            String moveCountStr = sc.next();

            validateExceedInputNumMaxLength(moveCountStr);
            moveCount = Integer.parseInt(moveCountStr);
            validateMinInputNum(moveCount);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(MSG_NUMBER_FORMAT_EXCEPTION);
        }

        return moveCount;
    }

    private static void validateExceedInputNumMaxLength(String moveCountStr) {
        if (moveCountStr.length() > MAX_INPUT_MOVE_COUNT) {
            throw new InputMoveCountIllegalArgumentException(MSG_MOVE_COUNT_LENGTH_EXCEED_EXCEPTION);
        }
    }

    private static void validateMinInputNum(int inputMoveCount) {
        if (inputMoveCount <MIN_INPUT_MOVE_COUNT) {
            throw new InputMoveCountIllegalArgumentException(MSG_MOVE_MIN_VALUE_EXCEPTION);
        }
    }
}
