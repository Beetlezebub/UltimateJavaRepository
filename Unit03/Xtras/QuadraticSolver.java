package Unit03.Xtras;

import java.util.Scanner;
import java.lang.Math;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner coeff = new Scanner(System.in);

        System.out.println("Enter the first coefficient (number).");
        int a = coeff.nextDouble();

        System.out.println("Enter the second coefficient (number).");
        int b = coeff.nextDouble();

        System.out.println("Enter the last coefficient (number).");
        int c = coeff.nextDouble();

        coeff.close();

        int discriminant = Math.sqrt(Math.pow(b, 2) - 4*(a)*(c));
        System.out.print(discriminant);
        //(-b(+-)-/(b)^2-4(a)(c))/2(a)

    }
}
// javac Unit03\Xtras\QuadraticSolver.java
// java Unit03.Xtras.QuadraticSolver