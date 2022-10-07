package racingcar.domain;

import racingcar.exception.CarNameLengthException;

import static racingcar.domain.OptionConstants.CAR_NAME_MAX_LENGTH;

public class CarName {
    private String carName;

    public CarName(String carName) {
        validateCarNameLength(carName);
        this.carName = carName;
    }

    public String getCarName() {
        return this.carName;
    }

    private void validateCarNameLength(String carName) {
        if (carName.length() > CAR_NAME_MAX_LENGTH) {
            throw new CarNameLengthException();
        }
    }
}
