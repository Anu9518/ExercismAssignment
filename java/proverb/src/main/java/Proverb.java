class Proverb {

    String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String result = "";
    String recite() {
        if (words.length == 0)
            return result;
        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i+1];
            result += "For want of a " + s1 + " the " + s2 + " was lost.\n";
        }
        result += "And all for the want of a " + words[0] + ".";
        return result;
    }

}
