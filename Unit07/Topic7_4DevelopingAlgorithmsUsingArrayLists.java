package Unit07;

import java.util.ArrayList;

public class Topic7_4DevelopingAlgorithmsUsingArrayLists {
    private static double findMax(ArrayList<Double> values){
        double max = values.get(0);

        for (int index = 1; index < values.size(); index++) {
            if (values.get(index) > max) {
                max = values.get(index);
            }
        }
        return max;
    }

    private static int findMin(ArrayList<Integer> values){
        int min = Integer.MAX_VALUE;

        for (int currentValue : values){
            if (currentValue < min){
                min = currentValue;

            }
        }
        return min;
    }

    private static int findSum(ArrayList<Integer> values){
        int sum = 0;

        for (int i = 0; i < values.size(); i++){
            sum += values.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        // ArrayList<Double> a = new ArrayList<>();
        // a.add(3.14);
        // a.add(2.17);
        // a.add(-4.22);
        // a.add(-7.0);

        // ArrayList<Integer> b = new ArrayList<>();
        // b.add(1);
        // b.add(2);
        // b.add(3);
        // b.add(4);

        // System.out.println("The max of the array is: " + findMax(a));
        // System.out.println("The min of the array is: " + findMin(b));

        //Practice in video code
        ArrayList<Integer> pracCode = new ArrayList<>();
        pracCode.add(4);
        pracCode.add(12);
        pracCode.add(21);
        pracCode.add(9);
        pracCode.add(10);

        System.err.println("The sum of the array is: " + findSum(pracCode));
    }

}
