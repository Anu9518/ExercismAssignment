class Acronym {

    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        char[] input = phrase.toCharArray();
        String result = "" + input[0];
        for (int i = 1; i < input.length - 1; i++) {
            if (input[i] == 32 || input[i] == '-' || input[i] == '_')
                if ((input[i + 1]+"").matches("^[a-zA-Z]*$"))
                    result += input[i + 1];
        }
        return result.toUpperCase();

    }

}
