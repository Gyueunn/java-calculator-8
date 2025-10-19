package calculator;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        String input_text; // 입력 받는 문자열
        String[] array_word; // 숫자 문자 저장 배열
        int total_sum = 0;

        System.out.println("덧셈할 문자열을 입력해 주세요.");
        input_text  = Console.readLine();

        if(input_text == null && input_text.length() == 0) {// 입력 값 공백 예외 처리
            throw new IllegalArgumentException("입력 값이 없습니다.");
        }

        array_word = input_text.split(",|:");
        int[] array_nums = new int[array_word.length];

        for(int i = 0; i < array_word.length; i++) {// 공백 포함 예외 처리
            if (array_word[i].contains(" ")) {
                throw new IllegalArgumentException("공백이 입력될 수 없습니다.");
            }
            array_nums[i] = Integer.parseInt(array_word[i]);

            if (array_nums[i] < 0) {// 음수 예외 처리
                throw new IllegalArgumentException("음수가 입력될 수 없습니다.");
            }
            total_sum += array_nums[i];
        }
        System.out.println("결과 : " + total_sum);
    }
}
