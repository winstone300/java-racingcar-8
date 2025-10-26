package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.model.Car;

public class OutputView {
    public void printStartPrompt() {
        System.out.println("실행결과");
    }

    public void printRoundResult(List<Car> carList) {
        for (Car car : carList) {
            String bar = "-".repeat(car.getPos());
            System.out.println(car.getName() + " : " + bar);
        }
        System.out.println();
    }

    public void printWinnerResult(List<Car> carList) {
        String s = carList.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));

        System.out.println("최종 우승자 : " + s);
    }
}
