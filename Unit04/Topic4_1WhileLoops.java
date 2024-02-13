package Unit04;

public class Topic4_1WhileLoops {
    public static void main(String[] args) {
        // int number = 5384;
        // int sum = 0;
        // while(number > 0){
        //     int lastDigit = number % 10;
        //     sum += lastDigit;
        //     number = number/10;
        // }
        // System.out.println("The sum of the digits is " + sum);

        double mon = 200.0;
        double interest = .10;
        int years = 0;
        while (mon <= 1000.0)
        {
            mon += mon*interest;
            years ++;
        }
        System.out.println("It takes " + years + " years to reasch $1000 in the bank account.");

    }
}
// javac Unit04\Topic4_1WhileLoops.java; java Unit04.Topic4_1WhileLoops