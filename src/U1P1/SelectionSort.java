package U1P1;

public class SelectionSort {
    public static void main(String[] args) {

        int[] numbers = {7,9,3,4,2,8,10,17,67,34,2,7,1,41};
        int smallest = 0;
        int tempValue;
        for(int j=0;j<numbers.length;j++) {
            for (int i = j; i < numbers.length; i++) {
                if (numbers[i] < numbers[smallest]) {
                    smallest = i;
                }
            }
        }
        tempValue = numbers[0];
        numbers[0]=numbers[smallest];
        numbers[smallest]=tempValue;


    }

}
