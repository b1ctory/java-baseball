package model;

import java.util.List;
import java.util.stream.IntStream;

public class BaseBall {
     public static int countStrike(List<Integer> computer, List<Integer> user) {
        return IntStream.range(0, computer.size())
                .map(i -> (user.get(i) == computer.get(i) ? 1 : 0))
                .sum();
    }

    public static int countBall(List<Integer> computer, List<Integer> user) {
        return IntStream.range(0, computer.size())
                .map(i -> isBall(computer,user,i) ? 1 : 0)
                .sum();
    }

    public static int countNothing(List<Integer> computer, List<Integer> user) {
        return IntStream.range(0, computer.size())
                .filter(i -> countStrike(computer, user) == 0 && countBall(computer, user) == 0)
                .sum();
    }

    private static boolean isBall(List<Integer> computer, List<Integer> user, int i) {
        if((user.get(i) == computer.get((i + 1) % 3))  || (user.get(i) == computer.get((i + 2) % 3)))
            return true;
        return false;
    }

}
