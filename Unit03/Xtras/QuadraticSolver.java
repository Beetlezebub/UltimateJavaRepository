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
        //int plusQuad = ((b*-1) + 
        //(-b(+-)-/(b)^2-4(a)(c))/2(a)

    }
}
// javac Unit03\Xtras\QuadraticSolver.java
// java Unit03.Xtras.QuadraticSolver

// This line added from Beetle's laptop :)
