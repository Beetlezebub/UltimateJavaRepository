package Unit03.Xtras;

import java.util.Scanner;

public class BasicTextAnalysis {
    public static void main(String[] args) {

        Scanner tana = new Scanner(System.in);

        System.out.println("Enter your text:");
        String text = tana.nextLine();

        tana.close();

        int numchar = text.length();
        int spcin = text.indexOf(" ");
        String firstWord = text.substring(0, spcin);
        int perin = text.indexOf(".");
        String firstSentence = text.substring(0, perin);
        
        System.out.println("Number of Characters: " + numchar);
        System.out.println("First Word: " + firstWord);
        System.out.println("First Sentence: " + firstSentence);
    }
}

// Enter your text interactively
// javac Unit03/Xtras/BasicTextAnalysis.java
// java Unit03.Xtras.BasicTextAnalysis

// Use a file as input
// javac Unit03/Xtras/BasicTextAnalysis.java
// cat Unit03/Xtras/gettysburg-address.txt | java Unit02.Xtras.BasicTextAnalysis
