package calculator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split {
    public static String[] splitInput(String inputText) {
        String[] word;

        Pattern pattern = Pattern.compile("//(.*?)\\\\n");
        Matcher matcher = pattern.matcher(inputText);

        if (matcher.find()) {
            String splitWord = matcher.group(1);

            if (splitWord == null || splitWord.isEmpty()) {
                throw new IllegalArgumentException("커스텀 구분자가 존재하지 않습니다.");
            }

            String numWord = inputText.substring(matcher.end());
            word = numWord.split(Pattern.quote(splitWord));
        }
        else {
            word = inputText.split("[,:]");
        }

        return word;
    }
}