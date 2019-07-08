import java.util.ArrayList;
import java.util.List;

class ResistorColor {
    int colorCode(String color) {
        String[] colorsArr = colors();
        for (int i = 0; i < colorsArr.length; i++) {
            if (colorsArr[i].equals(color))
                return i;
        }
        return -1;
    }

    String[] colors() {
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
