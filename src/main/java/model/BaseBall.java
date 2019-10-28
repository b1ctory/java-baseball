package model;

import util.BaseBallDto;
import util.RandomGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BaseBall {
    private List<Integer> computerAnswer;
    private List<Integer> userAnswer;

    public BaseBall(){
        this.computerAnswer = RandomGenerator.generateRandomNumber();
    }

    public void initUsers(List<Integer> integerList){
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            integers.add(integerList.get(i));
        }
        this.userAnswer = integers;
    }

    public int getStrike() {
        return IntStream.range(0, computerAnswer.size())
                .map(i -> (userAnswer.get(i) == computerAnswer.get(i) ? 1 : 0))
                .sum();
    }

    private int getBall() {
        return IntStream.range(0, computerAnswer.size())
                .map(i -> isBall(computerAnswer,userAnswer,i) ? 1 : 0)
                .sum();
    }

    public BaseBallDto getResult() {
        return new BaseBallDto(getStrike(), getBall());
    }

    private boolean isBall(List<Integer> computer, List<Integer> user, int i) {
        if ((user.get(i) == computer.get((i + 1) % 3))  || (user.get(i) == computer.get((i + 2) % 3))) {
            return true;
        }
        return false;
    }
}