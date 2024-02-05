package Unit03.Xtras;

import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner coeff = new Scanner(System.in);

        System.out.println("Enter the first coefficient (number).");
        double num1 = coeff.nextDouble();

        System.out.println("Enter the second coefficient (number).");
        double num2 = coeff.nextDouble();

        System.out.println("Enter the last coefficient (number).");
        double num3 = coeff.nextDouble();

        coeff.close();

    }
}
// javac Unit03\Xtras\QuadraticSolver.java
// java Unit03.Xtras.QuadraticSolver