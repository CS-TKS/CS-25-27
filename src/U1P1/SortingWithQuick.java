package U1P1;

public class SortingWithQuick {

    public static void quickSort(int start, int finish, int[] numbers){
        if(start >= finish){
            return;
        }
        int left = start;
        int right = finish;
        int pivot = numbers[(start+finish)/2];

        while(left<right){
            while(numbers[left]<pivot){
                left = left +1;
                System.out.println("left: " + left);
            }
            while(numbers[right]>pivot){
                right = right -1;
                System.out.println("right: " + right);
            }

            if(left<=right){
                System.out.println("Swapping " + numbers[left] + " with " + numbers[right]);
                int temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;
                left = left + 1;
                right = right -1;
                System.out.println();
                for(int i = 0; i<numbers.length; i++){
                    System.out.print(numbers[i] + " ");
                }
                System.out.println();
                System.out.println("left: " + left);
                System.out.println("right: " + right);
            }

        }

        System.out.println("quickSort from start: " + start + " right: " + right);
        quickSort(start, right, numbers);
        System.out.println("quickSort from right: " + right + " finish: " + finish);
        quickSort(left, finish, numbers);

    }


    public static void main(String[] args) {
        int numbers[] = {16,13,4,22,1,9,5};
        System.out.println("Array to sort:");
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        quickSort(0,numbers.length-1,numbers);
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }


    }


}
