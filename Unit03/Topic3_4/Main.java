package Unit03.Topic3_4;

public class Main {
  public static void main(String[] args) {
    double av1 = 93.5;
    System.out.println("Current average: " + av1);
    if (av1 > 89.45)
    {
      System.out.println("You have an A Average");
    }
    else if (av1 >= 79.45 && av1 <= 89.45)
    {
      System.out.println("You have a B average.");
    }
  }

}

// javac Unit03/Topic3_4/Main.java; java Unit03.Topic3_4.Main