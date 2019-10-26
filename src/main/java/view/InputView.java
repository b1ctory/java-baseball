package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static Scanner SCANNER;

    public static List<String> inputNumber() {
        SCANNER = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");
        return Arrays.asList(SCANNER.nextLine().split(""));
    }

    public static String inputRestart() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요 : ");
        return SCANNER.nextLine();
    }
}
