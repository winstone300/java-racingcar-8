package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WinnerCheck {
    public static List<Car> check(List<Car> carList) {
        int maxPos = carList.stream()
                .mapToInt(Car::getPos)
                .max().orElse(0);

        return carList.stream()
                .filter(c -> c.getPos()==maxPos)
                .collect(Collectors.toList());
    }
}
