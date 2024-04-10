package Unit06;

public class Topic6_4DevelopingAlgorithmsUsingArrays {
    private static double findMax (double [] values){
        double max = values[0];
        for (int i = 1; i < values.length; i++){
            if (values[i] > max){
                max = values[i];
            }
        }
        return max;
    }

    private static int findMin(int [] values){
        int min = Integer.MAX_VALUE;
        for (int cV : values){
            if (cV < min){
                min = cV;
            }
        }
        return min;
    }

    private static double findAvg(double[] values){
        double avg = 0.0;
        for (int i = 0; i < values.length; i++){
            avg += values[i];
        }
        avg /= values.length;
        return avg;
    }

    private static void shiftR(int[] values, int shift){
        int [] shifted = new int [values.length];
        for (int i = 0; i < values.length; i++){
            shifted [Math.abs((i + shift)) % values.length] = values[i];
        }
        values = shifted;
        for (int num : values){
            System.out.println(num);
        }
    }

    private static void shiftL(int[] value, int shift){
        int [] shifted = new int [value.length];
        for (int count = 0; count < shift; count++){
            int temp = value[0];
            for (int i = 0; i < value.length; i++){
                value[i] = value[i+1];
            }
            value[value.length - 1] = temp;
        }
        for (int num : value){
            System.out.println(num);
        }
    }
    
    public static void main(String[] args) {
        // double [] a = {10.0, 20.0, 30.0, 40.0};
        // System.out.println(findAvg(a));
        int [] b = {1, 2, 3, 4, 5};
        shiftR(b, 8);

    }
}
