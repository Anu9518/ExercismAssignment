import java.util.Optional;

class RaindropConverter {

    String convert(int number) {
        int temp = 3;
        String result = "";
        while(temp <= 7){
            if(number % temp == 0)
                if(temp == 3)
                    result+="Pling";
                else if(temp == 5)
                    result+="Plang";
                else if(temp == 7)
                    result+="Plong";
            temp = temp+2;

        }
        if(result.equals("")) {
            return String.valueOf(number);
        }
        else
            return result;
    }

}
