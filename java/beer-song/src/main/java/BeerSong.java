public class BeerSong {

    public String sing(int i1, int i2) {
        String start = "";
        String end = "";
        String result = "";
        int input1 = i1;
        for (int i = 0; i < i2; i++) {
            String end1 = "one";
            String firstLine;
            String secondLine;

            if (input1 == 0)
                start = "no more bottles";
            else {
                if (input1 == 1)
                    start = String.valueOf(input1) + " bottle";
                else
                    start = String.valueOf(input1) + " bottles";
            }
            if (input1 - 1 == 0) {
                end = "no more bottles";
                end1 = "it";
            }
            else {
                if (input1 - 1 == 1)
                    end = String.valueOf(input1 - 1) + " bottle";
                else
                    end = String.valueOf(input1 - 1) + " bottles";

            }

            firstLine = start + " of beer on the wall, " + start + " of beer.\n";
            if (input1 - 1 != -1)
                secondLine = "Take " + end1 + " down and pass it around, " + end + " of beer on the wall.\n\n";
            else
                secondLine = "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";

            String format = Character.toUpperCase(firstLine.charAt(0)) + firstLine.substring(1);
            result += format + secondLine;
            input1--;
        }
        return result;
    }

    public String singSong() {
        return sing(99, 100);
    }
}
