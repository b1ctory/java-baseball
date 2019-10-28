package controller;

import model.BaseBall;
import view.InputView;
import view.OutputView;

public class BaseBallController {
    private static final int REGAME = 1;
    private static final int THREE_STRIKE = 3;
    private boolean flag = true;

    private BaseBall baseBall;

    public void run() {
        do {
            this.baseBall = new BaseBall();
            startGame();
            flag = true;
        } while(InputView.inputRestart() == REGAME);
    }

    public void startGame() {
        while(flag) {
            baseBall.initUsers(InputView.inputNumbers());
            OutputView.printStatus(baseBall.getResult());
            isAnswer(baseBall.getStrike());
        }
    }

    private void isAnswer(int strike) {
        if (strike == THREE_STRIKE) {
            flag = false;
        }
    }
}
