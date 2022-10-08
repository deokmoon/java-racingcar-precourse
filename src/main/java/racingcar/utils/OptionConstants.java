package racingcar.utils;

public class OptionConstants {
    public static final int CAR_NAME_MAX_LENGTH = 5; // 자동차 이름 최대 길이
    public static final int MIN_PARTICIPANT_CARS = 2; // 참가하는 자동차 최소 인원
    public static final int MAX_INPUT_MOVE_COUNT = 4; // 입력받을 수 있는 시도할 횟수에 대한 최대 문자열 길이
    public static final int MIN_INPUT_MOVE_COUNT = 1; // 입력받은 시도할 횟수 최소 값
    public static final String CAR_NAME_SPLIT_CHARACTER = ","; // 자동차 이름 구분 문자열

    // Exception
    public static final String MSG = "입력할 수 있는 숫자는 최대 4자리입니다.";
    public static final String MSG_NUMBER_FORMAT_EXCEPTION = "숫자만 입력할 수 있습니다.";
    public static final String MSG_MOVE_COUNT_LENGTH_EXCEED_EXCEPTION = "입력할 수 있는 숫자는 최대 4자리입니다.";
    public static final String MSG_MOVE_MIN_VALUE_EXCEPTION = "시도할 횟수는 최소 1이상입니다.";



}
