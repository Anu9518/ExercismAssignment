public class Bob {

    public String hey(String input1) {
        String input2 = input1.replaceAll(" ", "");
        String input = input2.replaceAll("\n", "");
        int length = input.length();
        if(length == 0)
            return "Fine. Be that way!";
        int upper = 0;
        int lower = 0;
        char[] inputArr = input.toCharArray();
        for (int i = 0; i < length; i++) {
            if (Character.isLowerCase(inputArr[i]))
                lower++;
            if (Character.isUpperCase(inputArr[i]))
                upper++;
        }
        if (lower == 0 && upper!=0){
            if(inputArr[length-1] == '?')
                return "Calm down, I know what I'm doing!";
            else
                return "Whoa, chill out!";
        }
        if (inputArr[length-1] == '?')
            return "Sure.";
        if (!(input.matches(".*\\w.*")))
            return "Fine. Be that way!";
        else
            return "Whatever.";

    }
}
