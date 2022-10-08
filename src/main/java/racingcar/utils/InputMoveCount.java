package racingcar.utils;

import racingcar.exception.InputMoveCountExceedException;

import java.util.Scanner;

import static racingcar.utils.OptionConstants.MAX_INPUT_MOVE_COUNT;

public class InputMoveCount {
    public static int inputMoveCount() {
        Scanner sc = new Scanner(System.in);
        int moveCount;
        try {
            String moveCountStr = sc.next();

            validateExceedInputNumMaxLength(moveCountStr);
            moveCount = Integer.parseInt(moveCountStr);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("숫자만 입력할 수 있습니다.");
        }

        return moveCount;
    }

    private static void validateExceedInputNumMaxLength(String moveCountStr) {
        if (moveCountStr.length() > MAX_INPUT_MOVE_COUNT) {
            throw new InputMoveCountExceedException();
        }
    }
}
