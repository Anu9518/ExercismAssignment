import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        char[] inputArr = input.toLowerCase().toCharArray();
        int length = inputArr.length;
        int i = 0;
        Arrays.sort(inputArr);
        if (length < 26)
            return false;
        while (i < length - 1) {
            if (inputArr[i] >= 'a' && inputArr[i] <= 'z') {
                if (!((inputArr[i]  == inputArr[i + 1]) || (inputArr[i] +1  == inputArr[i + 1]))){
                    return false;
                }
            }
                i++;
        }
        return true;
    }

}


