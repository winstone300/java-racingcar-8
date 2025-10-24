package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WinnerCheckTest {
    @Test
    void 우승자가_한명일때_테스트(){
        int[] scores = new int[]{1,2,3,4,5};
        String[] names = new String[]{"a","b","c","d","e"};

        ArrayList<String> winners = WinnerCheck.check(names,scores);

        assertEquals(new ArrayList<>(List.of("e")),winners);
    }

    @Test
    void 우승자가_두명일때_테스트(){
        int[] scores = new int[]{1,6,3,4,6};
        String[] names = new String[]{"a","b","c","d","e"};

        ArrayList<String> winners = WinnerCheck.check(names,scores);

        assertEquals(new ArrayList<>(List.of("b","e")),winners);
    }

    @Test
    void 우승자가_여러명일때_테스트(){
        int[] scores = new int[]{3,1,3,3,3};
        String[] names = new String[]{"a","b","c","d","e"};

        ArrayList<String> winners = WinnerCheck.check(names,scores);

        assertEquals(new ArrayList<>(List.of("a","c","d","e")),winners);
    }
}
