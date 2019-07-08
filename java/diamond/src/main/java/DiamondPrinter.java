import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {
    List<String> result = new ArrayList<>();

    List<String> printToList(char a) {
        int start = 65;
        int diff = a - start;
        while (start <= a && diff >= 0) {
            String out = "";
            for (int i = 0; i < diff; i++)
                out += " ";
            out += (char) start;
            for (int i = 0; i < diff; i++)
                out += " ";
            result.add(out);
            start++;
            diff--;
        }
        System.out.println(result);
        return result;
    }

}
