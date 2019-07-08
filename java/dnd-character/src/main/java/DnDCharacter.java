import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {
    Random rand = new Random();

    int ability() {
        List<Integer> randomList = new ArrayList<>();
        rand.setSeed(10);
        for (int i = 0; i <= 3; i++)
            randomList.add(rand.nextInt(7));
        Collections.sort(randomList);
        return randomList.get(1)+randomList.get(2)+randomList.get(3);
    }

    int modifier(int input) {
        double result = ((input - 10) / 2.0);
        if (result < 0) {
            return (-1 * (int) Math.round(Math.abs(result)));

        } else {
            return (int) Math.abs(Math.round(result * -1));
        }
    }

    int getStrength() {
        return ability();
    }

    int getDexterity() {
        return ability();
    }

    int getConstitution() {
        return ability();
    }

    int getIntelligence() {
        return ability();
    }

    int getWisdom() {
        return ability();
    }

    int getCharisma() {
        return ability();
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

}
