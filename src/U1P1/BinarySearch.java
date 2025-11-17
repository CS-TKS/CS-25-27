package U1P1;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args){
        System.out.println("Binary Search");

        Random rand = new Random();
        // Generate random array
        int numberOfElements = 100000;




        int[] numbers = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            numbers[i] = rand.nextInt(100);
        }

        // traverse array
        int tempValue;
        for(int i = 0; i<numbers.length-1;i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                // check pair for sorting
                if (numbers[j] > numbers[j + 1]) {
                    // if not sorted swap
                    tempValue = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tempValue;
                }
            }
        }
        int target = 50;
        boolean found = false;
        int lower = 0;
        int upper = numbers.length-1;
        int mid = 0;
        while(!found && (lower<upper)){
            mid = (lower+upper)/2;
            if(numbers[mid] == target){
                found = true;

            }else if (numbers[mid]<target){
                lower=mid+1;
            }else{
                upper = mid-1;
            }
        }
        if (found){
            System.out.println("Found at position: " + mid);
        }else{
            System.out.println("Not found");
        }



    }
}
