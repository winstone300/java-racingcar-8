package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class WinnerCheckTest {
    @Test
    void 우승자가_한명일때_테스트() {
        List<Car> cars = List.of(
                new Car("a", 1),
                new Car("b", 2),
                new Car("c", 3),
                new Car("d", 4),
                new Car("e", 5) // 우승
        );
        List<Car> winners = WinnerCheck.check(cars);

        assertEquals(1, winners.size());
        assertEquals("e", winners.get(0).getName());
        assertEquals(5, winners.get(0).getPos());
    }

    @Test
    void 우승자가_두명일때_테스트() {
        List<Car> cars = List.of(
                new Car("a", 5),  // 우승
                new Car("b", 2),
                new Car("c", 5),  // 우승
                new Car("d", 4)
        );

        List<Car> winners = WinnerCheck.check(cars); // List<Car> 반환

        assertEquals(2, winners.size());

        Set<String> winnerNames = winners.stream().map(Car::getName).collect(Collectors.toSet());
        assertEquals(Set.of("a", "c"), winnerNames);

        assertTrue(winners.stream().allMatch(c -> c.getPos() == 5));
    }

    @Test
    void 우승자가_여러명일때_테스트() {
        List<Car> cars = List.of(
                new Car("a", 3),
                new Car("b", 7),  // 우승
                new Car("c", 7),  // 우승
                new Car("d", 1),
                new Car("e", 7)   // 우승
        );

        List<Car> winners = WinnerCheck.check(cars);

        assertEquals(3, winners.size());

        Set<String> winnerNames = winners.stream().map(Car::getName).collect(Collectors.toSet());
        assertEquals(Set.of("b", "c", "e"), winnerNames);

        assertTrue(winners.stream().allMatch(c -> c.getPos() == 7));
    }
}
