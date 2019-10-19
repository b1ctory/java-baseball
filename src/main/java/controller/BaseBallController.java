package controller;

import model.BaseBall;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BaseBallController {
    private List<Integer> computerAnswer;
    private List<Integer> userAnswer;
    private OutputView outputView = new OutputView();
    private boolean gameEnd = true;

    public static final int REGAME = 1;

    public BaseBallController(){
        run();
    }

    public List<Integer> convertToList(List<String> stringList){
        List <Integer> integerList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            integerList.add(Integer.parseInt(stringList.get(i)));
        }
        return integerList;
    }

    private int isStrike(List<Integer> computer , List<Integer> user){
        return  IntStream.range(0,computer.size())
                .map(i -> (user.get(i) == computer.get(i) ? 1 : 0))
                .sum();
    }

    private int isBall(List<Integer> computer , List<Integer> user){
        return IntStream.range(0,computer.size())
                .filter(i -> user.get(i) != computer.get(i))
                .map(i -> ((user.get(i) == computer.get((i + 1) % 3))
                        || (user.get(i) == computer.get((i + 2) % 3)))? 1 : 0 )
                .sum();
    }

    private void isNothing(List<Integer> computer, List<Integer> user){
        int nothing = IntStream.range(0,computer.size())
                .filter(i -> isStrike(computer,user) == 0 && isBall(computer,user) == 0)
                .sum();
        if(nothing == 3){
            outputView.printNothing();
        }
    }

    public void isAnswer(int strike) {
        outputView.printStrike(isStrike(computerAnswer,userAnswer));
        outputView.printBall(isBall(computerAnswer,userAnswer));
        isNothing(computerAnswer,userAnswer);
        if (strike == 3){
            gameEnd = false;
        }
    }

    public void startGame(){
        while(gameEnd){
            userAnswer = convertToList(InputView.inputNumber());
            isAnswer(isStrike(computerAnswer,userAnswer));
        }
    }

    public void run(){
        do{
            computerAnswer = new ArrayList<>(BaseBall.generateRandomNumber());
            startGame();
            gameEnd = true;
        } while (Integer.parseInt(InputView.inputRestart()) == REGAME);
    }

}
