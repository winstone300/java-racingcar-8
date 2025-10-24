package racingcar.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CarNameParserTest {
    private final CarNameParser parser = new CarNameParser();

    @Test
    public void 쉼표로_구분_테스트() {
        String input = "aa,bb,cc,dd,ee";
        List<Car> carList = new ArrayList<>(
                List.of(new Car("aa"), new Car("bb"), new Car("cc"), new Car("dd"), new Car("ee")));
        assertEquals(carList, parser.sepCarList(input));
    }

    @Test
    public void 자동차_이름_검증_4자_이하일때_테스트() {
        String input = "aa,bb,cc,dd,ee";
        assertTrue(parser.carNameLenCheck(parser.sepCarList(input)));
    }

    @Test
    public void 자동차_이름_검증_5자_이상일때_테스트() {
        String input = "aa,bbbbb,cc,dd,ee";
        assertThatThrownBy(() -> parser.carNameLenCheck(parser.sepCarList(input))).isInstanceOf(
                        IllegalArgumentException.class)
                .hasMessage("자동차 이름 길이가 5자 이상");
    }
}
