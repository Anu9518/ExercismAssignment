public class PigLatinTranslator {
    String result = "";

    public String translate(String input) {
        String[] splitInput = input.split(" ");
        for (int j = 0; j < splitInput.length; j++) {
            char[] inputArr = splitInput[j].toCharArray();
            if (inputArr[0] == 'a' || inputArr[0] == 'e' || inputArr[0] == 'i' || inputArr[0] == 'o' || inputArr[0] == 'u'
                    || (inputArr[0] == 'y' && inputArr[1] == 't') || (inputArr[0] == 'x' && inputArr[1] == 'r')) {
                result += input + "ay";


            } else {
                for (int i = 1; i < inputArr.length; i++) {
                    if (inputArr[i] == 'a' || inputArr[i] == 'e' || inputArr[i] == 'i' || inputArr[i] == 'o' || inputArr[i] == 'y' || (inputArr[i] == 'u' && (inputArr[i - 1] != 'q'))) {
                        String str = splitInput[j].substring(i) + splitInput[j].substring(0, i);
                        result += str + "ay";
                        break;

                    }

                }
            }

            if (j == splitInput.length - 1)
                return result;
            else
                result += " ";
        }
        return result;
    }
}
