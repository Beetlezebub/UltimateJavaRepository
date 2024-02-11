package Unit01.Xtras;

import java.lang.Math;

public class TwoDSix {
    public static void main(String[] args) {
        int roll1 = ((int) (Math.random()*6) + 1);
        int roll2 = ((int) (Math.random()*6) + 1);
        int total = roll1 + roll2;
        System.out.println("You rolled a " + roll1 + "and a " + roll2 + ", for a total of " + total + ".");
    }
}
