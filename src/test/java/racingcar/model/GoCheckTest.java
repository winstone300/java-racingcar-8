package racingcar.model;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GoCheckTest{
    @Test
    public void 값이_4_이상일때_테스트(){
        int num = RandomNumber.randomNumber(4,9);
        assertTrue(GoCheck.goCheck(num));
    }

    @Test
    public void 값이_4_미만일때_테스트(){
        int num = RandomNumber.randomNumber(0,3);
        assertFalse(GoCheck.goCheck(num));
    }
}
