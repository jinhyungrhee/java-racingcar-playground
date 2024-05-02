package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static Integer splitAndSum(String input) {

        if (input == null || input.isEmpty()) {
            return 0;
        }

        if(input.length() == 1) {
            return Integer.parseInt(input);
        }

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);

        String[] numbers = {};
        if(m.find()) {
            String customDelimiter = m.group(1);
            numbers = m.group(2).split(customDelimiter);
        } else {
            numbers = input.split(",|:");
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            checkNegative(numbers[i]);
            sum += Integer.parseInt(numbers[i]);
        }

        return sum;
    }

    private static void checkNegative(String input) {
        if (Integer.parseInt(input) < 0) {
            throw new RuntimeException("음수 불가");
        }
    }

}
