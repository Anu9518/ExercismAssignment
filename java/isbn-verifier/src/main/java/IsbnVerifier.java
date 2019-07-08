import java.util.regex.Pattern;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        String inputString = stringToVerify.replaceAll("-", "");
        if (inputString.length() != 10)
            return false;
        char[] input = inputString.toCharArray();
        int result = 0;
        int temp = 10;
        for (int i = 0; i < input.length && temp >= 1; i++) {
            if (input[i] == 88 && i == input.length - 1) {
                result += 10 * temp;
                temp--;
            } else if (input[i] >= 48 && input[i] <= 57) {
                result += Character.getNumericValue(input[i]) * temp;
                temp--;
            }
        }
        if (result % 11 == 0)
            return true;
        return false;
    }

}
