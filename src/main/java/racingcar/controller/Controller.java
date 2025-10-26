package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.model.Car;
import racingcar.model.CarNameParser;
import racingcar.model.GoCheck;
import racingcar.model.RandomNumber;
import racingcar.model.WinnerCheck;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Controller {
    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();
    private String carNamesCsv;
    private int attemptCount;
    private final CarNameParser carNameParser = new CarNameParser();
    private List<Car> carList;
    private List<Car> winnerList;

    public void run() {
        //자동차 이름 입력
        inputView.printCarNamePrompt();
        carNamesCsv = Console.readLine();
        carList = carNameParser.sepCarList(carNamesCsv);

        //시도할 횟수
        inputView.printAttemptCountPrompt();
        attemptCount = Integer.parseInt(Console.readLine());

        //실행 결과
        outputView.printStartPrompt();
        for (int i = 0; i < attemptCount; i++) {
            step();
        }

        //우승자 출력
        winnerList = WinnerCheck.check(carList);
        outputView.printWinnerResult(winnerList);
    }

    public void step() {
        for (Car car : carList) {
            int num = RandomNumber.randomNumber(0, 9);
            GoCheck.moveIfPossible(car, num);
        }
        outputView.printRoundResult(carList);
    }
}
