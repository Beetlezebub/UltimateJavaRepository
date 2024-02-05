package Unit01.Xtras;

import java.lang.Math;

public class RandomStats {
    static void generate() {
         double gen = (double) (Math.random()*2);
         System.out.print(gen);
    }

    public static void main(String[] args) {
         double num1 = generate();
         double num2 = generate();
         double num3 = generate();
         double num4 = generate();
         double num5 = generate();
    }
}
// javac Unit01\Xtras\RandomStats.java; java Unit01.Xtras.RandomStats 27 93 94 76
// first half of semicolon separated code compiles the stuff, second half actually provides and plugs in values