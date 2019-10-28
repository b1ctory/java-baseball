package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomGenerator {
    private final static int MAX_NUMBER = 10;

    public static List<Integer> generateRandomNumber() {
        List<Integer> integerList = new ArrayList<>();
        for(int i = 1; i < MAX_NUMBER; i++) {
            integerList.add(i);
        }
        Collections.shuffle(integerList);
        return integerList.subList(0,3);
    }
}
