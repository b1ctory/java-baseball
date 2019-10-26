package view;

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

    public static void printNothing() {
        System.out.println("낫싱");
    }
}
