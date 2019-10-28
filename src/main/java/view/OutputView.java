package view;

import util.BaseBallDto;

public class OutputView {
    public static void printStrike(int strike) {
        if(strike > 0) {
            System.out.println(strike + "스트라이크");
        }
    }

    public static void printBall(int ball) {
        if(ball > 0) {
            System.out.println(ball + "볼");
        }
    }

    public static void printNothing(BaseBallDto dto) {
        if(dto.getStrike() == 0 && dto.getBall() == 0) {
            System.out.println("낫싱");
        }
    }

    public static void printStatus(BaseBallDto dto) {
        printStrike(dto.getStrike());
        printBall(dto.getBall());
        printNothing(dto);
    }
}
