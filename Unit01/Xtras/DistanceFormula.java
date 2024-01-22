package Unit01.Xtras;

public class DistanceFormula {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int x2 = Integer.parseInt(args[1]);
        int y1 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);

        int xTotal = ((x2 - x1)*(x2 - x1));
        int yTotal = ((y2 - y1)*(y2 - y1));
        double xYfin = (xTotal - yTotal);
    }
}

// javac Unit01\Xtras\DistanceFormula.java; java Unit01.Xtras.DistanceFormula 3 2
// first half of semicolon separated code compiles the stuff, second half actually provides and plugs in values