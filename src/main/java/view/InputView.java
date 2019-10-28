package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
    public static List<Integer> inputNumbers() {
        try {
            System.out.print("숫자를 입력해 주세요 : ");
            String numbers = new Scanner(System.in).nextLine();
            return Arrays.stream(numbers.split(""))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력하세요.");
            return inputNumbers();
        }
    }

    public static int inputRestart() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요 : ");
        return new Scanner(System.in).nextInt();
    }
}
