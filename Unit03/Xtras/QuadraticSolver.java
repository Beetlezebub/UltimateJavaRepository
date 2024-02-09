package Unit03.Xtras;

import java.util.Scanner;
import java.lang.Math;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner coeff = new Scanner(System.in);

        System.out.println("Enter the first coefficient (number).");
        double a = coeff.nextDouble();

        System.out.println("Enter the second coefficient (number).");
        double b = coeff.nextDouble();

        System.out.println("Enter the last coefficient (number).");
        double c = coeff.nextDouble();

        coeff.close();

        double discriminant = Math.sqrt(Math.pow(b, 2) - 4*(a)*(c));
        
        if (discriminant % 1 == 0){
            double plusQuad = ((b*-1) + discriminant);
            double minusQuad = ((b*-1) + discriminant);
        }
        //int plusQuad = ((int)(b*-1) + discriminant)
        //find way to make it not actually add if not a perfect and stuff
        //(-b(+-)-/(b)^2-4(a)(c))/2(a)

    }
}
// javac Unit03\Xtras\QuadraticSolver.java
// java Unit03.Xtras.QuadraticSolver

// This line added from Beetle's laptop :)
