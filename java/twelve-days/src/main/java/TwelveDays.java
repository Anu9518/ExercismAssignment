class TwelveDays {
    String[] numbers = new String[]{
            "", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
    };
    String[] gifts = new String[]{
            "", "a Partridge in a Pear Tree.\n", "two Turtle Doves", "three French Hens", "four Calling Birds",
            "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking",
            "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"
    };

    String verse(int verseNumber) {
        String result = "On the " + numbers[verseNumber] + " day of Christmas my true love gave to me: ";
        for (int i = verseNumber; i >= 1; i--) {
            if (i == 1 && verseNumber > 1)
                result += "and " + gifts[i];
            else if (i == 1)
                result += gifts[i];
            else
                result += gifts[i] + ", ";
        }

        return result;
    }

    String verses(int startVerse, int endVerse) {
        String result = "";
        while (startVerse <= endVerse) {
            result += verse(startVerse);
            if (startVerse < endVerse)
                result += "\n";
            startVerse++;
        }
        return result;
    }

    String sing() {
        return  verses(1,12);
    }
}
