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

    private static int shiftR(int[] values){
        int [] shifted = new int [values.length];
        return 0;
    }
    
    public static void main(String[] args) {
        double [] a = {10.0, 20.0, 30.0, 40.0};
        System.out.println(findAvg(a));
    }
}
