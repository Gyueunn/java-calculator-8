package calculator;

public class AddCalculator {
    public static int calculate(String[] arrayWord) {
        int totalSum = 0;

        for (int i = 0; i < arrayWord.length; i++) {
            if (!arrayWord[i].equals(arrayWord[i].trim()) || arrayWord[i].trim().isEmpty())  {
                throw new IllegalArgumentException("공백이 포함될 수 없습니다.");
            }

            int num = Integer.parseInt(arrayWord[i]);

            if (num < 0) {
                throw new IllegalArgumentException("음수가 입력될 수 없습니다.");
            }

            totalSum += num;
        }

        return totalSum;
    }
}