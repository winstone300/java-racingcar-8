package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {
    public static int randomNumber(int min, int max) {
        return Randoms.pickNumberInRange(min,max);
    }
}
