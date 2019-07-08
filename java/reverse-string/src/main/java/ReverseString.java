class ReverseString {

    String reverse(String inputString) {
        String reverse="";
        int length = inputString.length();
        for(int i=length-1;i>=0;i--)
            reverse+=inputString.charAt(i);
        return reverse;
    }
  
}