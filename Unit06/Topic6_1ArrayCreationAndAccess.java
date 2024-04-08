package Unit06;

public class Topic6_1ArrayCreationAndAccess {
    private int [] list;
    public void ArrayManipulator(int numElements){
        list = new int[numElements];
    }
    public int getMiddleIndex() {
        int midIn = 0;
        if (list.length % 2 == 0) {
            midIn = ((list.length/2) - 1);
        } else {
            midIn = (list.length/2);
        }
        return midIn;
    }
    public double getAvg(){
        double sum = 0.0;
        for (int number : list) {
            sum += number;
        }
        return (sum/list.length);
    }
    public static void main(String[] args) {
        //h
    }
}
