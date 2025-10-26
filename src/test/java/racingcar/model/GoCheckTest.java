package racingcar.model;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GoCheckTest{
    @Test
    public void 값이_4_이상일때_테스트(){
        Car car = new Car("car",2);
        int num = RandomNumber.randomNumber(4,9);
        GoCheck.moveIfPossible(car,num);
        assertEquals(car.getPos(),3);
    }

    @Test
    public void 값이_4_미만일때_테스트(){
        Car car = new Car("car",2);
        int num = RandomNumber.randomNumber(0,3);
        GoCheck.moveIfPossible(car,num);
        assertEquals(car.getPos(),2);
    }
}
