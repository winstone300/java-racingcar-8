package racingcar.model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RandomNumberTest {
    private static final int min = 0;
    private static final int max = 9;

    @Test
    public void 무작위_값_범위_테스트(){
        int num = RandomNumber.randomNumber(min,max);
        assertTrue(0<=num && num<=max);
    }

}
