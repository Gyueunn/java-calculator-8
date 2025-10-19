package calculator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split {
    public static String[] splitInput(String inputText) {
        String[] arrayWord;

        Pattern pattern = Pattern.compile("//(.*?)\\\\n");
        Matcher matcher = pattern.matcher(inputText);

        if (matcher.find()) {
            String splitWord = matcher.group(1);
            if (splitWord == null || splitWord.isEmpty()) {
                throw new IllegalArgumentException("공백이 구분자가 될 수 없습니다.");
            }

            String numWord = inputText.substring(matcher.end());
            arrayWord = numWord.split(Pattern.quote(splitWord));
        }
        else {
            arrayWord = inputText.split("[,:]");
        }

        return arrayWord;
    }
}