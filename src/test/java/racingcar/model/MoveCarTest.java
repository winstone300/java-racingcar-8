package racingcar.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoveCarTest {
    @Test
    public void 한칸_전진_테스트(){
        Car a = new Car("a");
        a.move();
        assertEquals(1,a.getPos());
    }

    @Test
    public void 세칸_전진_테스트(){
        Car a = new Car("a");
        a.move();
        a.move();
        a.move();
        assertEquals(3,a.getPos());
    }
}
