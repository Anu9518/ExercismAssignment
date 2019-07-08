import java.util.Arrays;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        char[] phrase_array = phrase.toLowerCase().toCharArray();
        Arrays.sort(phrase_array);
        for(int i = 0;i < phrase_array.length-1;i++){
            if(phrase_array[i] != 45 && phrase_array[i] != 32){
                if(phrase_array[i]==phrase_array[i+1]) {
                    return false;
                }
            }
        }
        return true;
    }

}
