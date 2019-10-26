package util;

import java.util.*;

public class RandomGenerator {
    private final static int MAX_NUMBER = 10;
    private final static int NUMBER_LENGTH = 3;
    private static Random RANDOM = new Random();
    public static HashSet<Integer> randomNumbers;

    public static HashSet<Integer> generateRandomNumber () {
        randomNumbers = new HashSet<>();
        while(randomNumbers.size() != NUMBER_LENGTH){
            randomNumbers.add(RANDOM.nextInt(MAX_NUMBER));
            randomNumbers.remove(0);
        }
        return randomNumbers;
    }
}
