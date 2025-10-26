package racingcar.view;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

class InputViewTest extends NsTest {

    @Test
    void 자동차_이름_안내_메시지_출력_테스트() {
        assertSimpleTest(() -> {
            new InputView().printCarNamePrompt();
        });

        assertThat(output().lines())
                .containsExactly("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    @Test
    void 시도_횟수_안내_메시지_출력_테스트() {
        assertSimpleTest(() -> {
            new InputView().printAttemptCountPrompt();
        });

        assertThat(output().lines())
                .containsExactly("시도할 횟수는 몇 회인가요?");
    }

    @Override
    public void runMain() {
    }
}