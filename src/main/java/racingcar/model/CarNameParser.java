package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CarNameParser {
    private static final Pattern DEFAULT_DELIMITERS = Pattern.compile("[,]");

    public CarNameParser() {
    }

    public List<Car> sepCarList(String input) {
        List<Car> carList = DEFAULT_DELIMITERS.splitAsStream(input)
                .map(String::trim)
                .map(Car::new)
                .collect(Collectors.toList());

        return carList;
    }
}
