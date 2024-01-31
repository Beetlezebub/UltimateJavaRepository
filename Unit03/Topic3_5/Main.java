package Unit03.Topic3_5;

public class Main {
  public static void main(String[] args) {
    int number = 36;
    if (number > 20)
    {
      if (number%6 == 0)
        System.out.println("Number is greater than 20 and divisible by 6.");
      else
        System.out.println("Number is greater than 20 but not divisible by 6.");
    }
    else
      {
        System.out.println("Number is not greater than 20.");
      }
  }

}

// javac Unit03/Topic3_5/Main.java; java Unit03.Topic3_5.Main