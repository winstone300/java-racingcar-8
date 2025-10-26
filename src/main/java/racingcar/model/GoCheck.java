package racingcar.model;

public class GoCheck {
    public static void moveIfPossible(Car car,int num) {
        if(num > 3) car.move();
    }
}
