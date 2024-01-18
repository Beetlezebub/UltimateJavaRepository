package Unit01.Topic1_5;

public class Main {
  public static void main(String[] args) {
    System.out.println(6/4);
    System.out.println(6.0/4);
    System.out.println(6/4.0);
    System.out.println((double) 6/4);

    double number = 11.0/4;
    int roundNumber = (int) (number + 0.5);
    System.out.println("11.0/4 = " + number);
    System.out.println("11/4 = " + (int)number);
    System.out.println("11.0/4 rounded = " + roundNumber);
  }
  
}

// javac Unit01/Topic1_5/Main.java; java Unit01.Topic1_5.Main
