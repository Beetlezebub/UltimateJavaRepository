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

        double discriminant = (Math.pow(b, 2) - ((4*(a))*(c)));
        double discrimCheck = (Math.sqrt(Math.pow(b, 2) - ((4*(a))*(c))));
        
        double plusQuad = 0.0;
        double minusQuad = 0.0;
        if (discriminant >= 0 ) {
            if (discrimCheck%1 == 0){
                plusQuad = (((b*-1) + Math.sqrt(discriminant))/(2*a));
                minusQuad = (((b*-1) - Math.sqrt(discriminant))/(2*a));
                if (plusQuad%1 == 0){
                    if (minusQuad%1 == 0) {
                        System.out.println("The solutions are: x = " + ((int)plusQuad) + ", x = " + ((int)minusQuad)); 
                    }
                    else{
                        System.out.println("The solutions are: x = " + ((int)plusQuad) + ", x = " + minusQuad);
                    }
                }
                else if (plusQuad%1 != 0 && minusQuad%1 == 0){
                    System.out.println("The solutions are: x = " + plusQuad + ", x = " + ((int)minusQuad));
                }
                else{
                    System.out.println("The solutions are: x = " + plusQuad + ", x = " + minusQuad);
                }
            }

            else{
                double calc1 = ((b*-1)/(2*a));
                double calc2 = (Math.sqrt(discriminant)/(2*a));
                plusQuad = calc1 + calc2;
                minusQuad = calc1 - calc2;
                System.out.println("The solutions are:");
                System.out.println("x = " + ((int)calc1) + " + sqrt(" + ((int)discriminant) + ") = " + plusQuad + ", x = " + ((int)calc1) + " - sqrt(" + ((int)discriminant) + ") = " + minusQuad);
            }
        }
        else if (discriminant < 0){
            System.out.println("No real solutions.");
        } 
        // else{
        //     if ()
        // }
        //int plusQuad = ((int)(b*-1) + discriminant)
        //find way to make it not actually add if not a perfect and stuff
        //(-b(+-)-/(b)^2-4(a)(c))/2(a)

    }
}
// javac Unit03\Xtras\QuadraticSolver.java
// java Unit03.Xtras.QuadraticSolver