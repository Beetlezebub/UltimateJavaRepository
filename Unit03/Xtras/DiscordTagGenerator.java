package Unit03.Xtras;

import java.util.Scanner;
import java.lang.Math;

public class DiscordTagGenerator {
    public static void main(String[] args) {

        Scanner usenam = new Scanner(System.in);

        System.out.println("Enter your discord username");
        String uname = usenam.nextLine();

        usenam.close();

        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);
        int num3 = (int) (Math.random()*10);
        int num4 = (int) (Math.random()*10);
        StringBuffer finTag = new StringBuffer();
        finTag.append(uname);
        finTag.append("#");
        finTag.append(num1);
        finTag.append(num2);
        finTag.append(num3);
        finTag.append(num4);

        System.out.println(finTag);

    }
}
// javac Unit03\Xtras\DiscordTagGenerator.java
// java Unit03.Xtras.DiscordTagGenerator