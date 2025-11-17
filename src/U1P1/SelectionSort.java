package U1P1;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random rand = new Random();
        // Generate random array
        int numberOfElements = 25;
        int numberOfSwaps = 0;
        int numberOfComparisons = 0;

        int[] numbers = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before Sorting");

        for(int i = 0; i < numberOfElements; i++){
            System.out.print(numbers[i]+" | ");
        }
        System.out.println();
        int smallest = 0;
        int tempValue;
        for(int j=0;j<numbers.length;j++) {
            for (int i = j; i < numbers.length; i++) {
                numberOfComparisons++;
                if (numbers[i] < numbers[smallest]) {
                    smallest = i;
                }
            }
            tempValue = numbers[smallest];
            numbers[smallest] = numbers[j];
            numbers[j] = tempValue;
            numberOfSwaps++;
        }


        System.out.println("After Sorting");
        for(int i = 0; i < numberOfElements; i++){
            System.out.print(numbers[i]+" | ");
        }

        System.out.println();
        System.out.println("Number of Swaps: " + numberOfSwaps);
        System.out.println("Number of Comparisons: "+ numberOfComparisons);




    }

}
