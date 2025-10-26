package racingcar.view;


import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import camp.nextstep.edu.missionutils.test.NsTest;
import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.model.Car;

class OutputViewTest extends NsTest {

    @Test
    void 라운드_결과_출력() {
        assertSimpleTest(() -> {
            List<Car> cars = List.of(
                    new Car("car1", 3),
                    new Car("car2", 1),
                    new Car("car3", 5)
            );
            new OutputView().printRoundResult(cars);
        });

        String nl = System.lineSeparator();
        String expected = "car1 : ---" + nl + "car2 : -" + nl + "car3 : -----";

        assertThat(output()).isEqualTo(expected);
    }


    @Test
    void 우승자_출력_1명() {
        assertSimpleTest(() -> {
            List<Car> cars = List.of(
                    new Car("car1", 3)
            );
            new OutputView().printWinnerResult(cars);
        });

        String expected = "최종 우승자 : car1";

        assertThat(output()).isEqualTo(expected);
    }

    @Test
    void 우승자_출력_여러명() {
        assertSimpleTest(() -> {
            List<Car> cars = List.of(
                    new Car("car1", 3),
                    new Car("car2", 3),
                    new Car("car3", 3)
            );
            new OutputView().printWinnerResult(cars);
        });

        String expected = "최종 우승자 : car1, car2, car3";

        assertThat(output()).isEqualTo(expected);
    }

    @Override
    public void runMain() {
    }
}
