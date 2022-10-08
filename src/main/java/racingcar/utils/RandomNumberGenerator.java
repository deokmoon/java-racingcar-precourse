package racingcar.utils;

import java.security.SecureRandom;

public class RandomNumberGenerator {
    public static int generateNumber(int min, int max) {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(max + 1) + min;
    }
}
