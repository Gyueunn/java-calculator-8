package calculator;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        int totalSum = 0;

        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String inputText  = Console.readLine();

        if (inputText != null && !inputText.isEmpty()) {
            String[] arrayWord = Split.splitInput(inputText);
            totalSum = AddCalculator.calculate(arrayWord);
        }

        System.out.println("결과 : " + totalSum);
    }
}
