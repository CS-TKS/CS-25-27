package U1P1;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {7,9,3,4,2,8,10,17,67,34,2,7,1,41};
        int tempValue;

        // traverse array
        for(int i = 0; i<numbers.length-1;i++){
            for(int j = 0 ; j<numbers.length-i-1; j++){
                // check pair for sorting
                if(numbers[j]>numbers[j+1]){
                    // if not sorted swap
                    tempValue = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1]=tempValue;
                }
            }



        }

        for(int i = 0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }


    }
}
