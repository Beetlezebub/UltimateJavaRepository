package Unit01.Xtras;

import java.lang.Math;

public class RandomStats {
    public static void main(String[] args) {
          double gen1 = (double) (Math.random()*2);
          double gen2 = (double) (Math.random()*2);
          double gen3 = (double) (Math.random()*2);
          double gen4 = (double) (Math.random()*2);
          double gen5 = (double) (Math.random()*2);
          double av = ((gen1 + gen2 + gen3 + gen4 + gen5)/5);
          double min = (double) (Math.min(gen1, gen5));
          double max = (double) (Math.max(gen1, gen5));
          System.out.println(gen1 + "; " + gen2 + "; " + gen3 + "; " + gen4 + "; " + gen5);
          System.out.println("Average: " + av);
          System.out.println("Minimum: " + min + "; Max: " + max);

    }
}
// javac Unit01\Xtras\RandomStats.java; java Unit01.Xtras.RandomStats 27 93 94 76
// first half of semicolon separated code compiles the stuff, second half actually provides and plugs in values