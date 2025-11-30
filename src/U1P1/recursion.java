package U1P1;

public class recursion {

    public static void main(String[] args) {
        pyramid(10);
        System.out.println(fibonnacci(8));
        int [] unsortedArray = {10,9,8,7,6,5,4,3,2,1};
        int [] sortedArray = new int[unsortedArray.length];
        sortedArray = mergeSort(unsortedArray);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

    public static int[] mergeSort(int[] arrayToSort){
        System.out.println("Array length before sorting:" + arrayToSort.length);
        // base case
        if (arrayToSort.length <= 1){
            return arrayToSort;
        }

        System.out.println("Unsorted array");
        for (int i = 0; i < arrayToSort.length; i++){
            System.out.print(arrayToSort[i] + " ");
        }
        System.out.println();

        // winding
        int midpoint = arrayToSort.length/2;
        System.out.println("Mid point = " + midpoint);
        int[] left = new int[midpoint];
        int[] right = new int[arrayToSort.length-midpoint];
        // populate left array
        for(int i = 0; i < left.length; i++){
            left[i] = arrayToSort[i];
        }
        // populate right array
        for(int i=0; i < right.length; i++){
            right[i] = arrayToSort[i+midpoint];
        }
        System.out.print("ArrayToSort: ");
        for(int i = 0; i < left.length; i++){
            System.out.print(left[i] + " ");
        }
        System.out.println();
        left = mergeSort(left);
        right = mergeSort(right);

        // unwind
        // Merge the two arrays
        int[] sortedArray = new int[arrayToSort.length];
        int leftIndex = 0;
        int rightIndex = 0;
        for(int i = 0; i < sortedArray.length; i++){
            while(leftIndex < left.length && rightIndex < right.length){
                if(left[leftIndex] < right[rightIndex]){
                    sortedArray[i] = left[leftIndex];
                    leftIndex++;
                    i++;
                }else {
                    sortedArray[i] = right[rightIndex];
                    rightIndex++;
                    i++;
                }
            }
            while(leftIndex <= left.length-1){
                sortedArray[i] = left[leftIndex];
                rightIndex++;
                i++;
            }
            while(rightIndex <= right.length-1){
                sortedArray[i] = right[rightIndex];
                leftIndex++;
                i++;
            }

        }

        return sortedArray;

    }

    public static int fibonnacci(int n){
        // base case
        if(n== 1){
            return 0;
        }
        if(n ==2){
            return 1;
        }
        // winding general case
        return fibonnacci(n-1)+fibonnacci(n-2);



    }
    public static void pyramid(int n){
        // base case
        if(n==0){
            return;
        }

        // winding general case
        pyramid(n-1);

        // unwinding
        for(int i=0;i<n;i++){
            System.out.print("#");
        }
        System.out.println();
    }
}
