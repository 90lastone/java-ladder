package view;

import java.util.Scanner;

public class InputView {
    private static final String PARTICIPATION_NAME = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String EXECUTE_RESULT = "실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)";
    private static final String LADDER_HEIGHT = "최대 사다리 높이는 몇 개인가요?";
    private static final String RESULT_NAME = "결과를 보고 싶은 사람은?";

    private static Scanner sc = new Scanner(System.in);

    public static String participationNames() {
        System.out.println(PARTICIPATION_NAME);
        return sc.next();
    }

    public static String executeResults() {
        System.out.println(EXECUTE_RESULT);
        return sc.next();
    }

    public static int ladderHeight() {
        System.out.println(LADDER_HEIGHT);
        return sc.nextInt();
    }

    public static String resultName() {
        System.out.println(RESULT_NAME);
        return sc.next();
    }
}
