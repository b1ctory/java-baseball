package controller;

import model.BaseBall;
import util.RandomGenerator;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;

import static model.BaseBall.countNothing;

public class BaseBallController {
    public static final int REGAME = 1;
    public static final int ALL_STRIKE_NUM = 3;
    public static final int NOTHING = 3;

    private List<Integer> computerAnswer;
    private boolean gameContinue = true;

    public void run() {
        do {
            computerAnswer = new ArrayList<>(RandomGenerator.generateRandomNumber());
            startGame();
            gameContinue = true;
        } while (Integer.parseInt(InputView.inputRestart()) == REGAME);
    }

    public void startGame() {
        List<Integer> userAnswer;
        while (gameContinue) {
            userAnswer = convertToList(InputView.inputNumber());
            isAnswer(BaseBall.countStrike(computerAnswer, userAnswer),userAnswer);
        }
    }

    public static List<Integer> convertToList(List<String> stringList) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            integerList.add(Integer.parseInt(stringList.get(i)));
        }
        return integerList;
    }

    public void checkNothing(List<Integer> userAnswer) {
        countNothing(computerAnswer, userAnswer);
        if (BaseBall.countNothing(computerAnswer,userAnswer) == NOTHING) {
            OutputView.printNothing();
        }
    }

    public void isAnswer(int strike, List<Integer> userAnswer) {
        OutputView.printStrike(BaseBall.countStrike(computerAnswer,userAnswer));
        OutputView.printBall(BaseBall.countBall(computerAnswer, userAnswer));
        checkNothing(userAnswer);
        if (strike == ALL_STRIKE_NUM) {
            gameContinue = false;
        }
    }
}
