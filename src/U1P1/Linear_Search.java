package U1P1;

public class Linear_Search {

    public static void main(String[] args) {
        int[] numbers = {7,9,3,4,2};
        int target = 5;
        int position = -1;

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == target){
                position = i;
            }

        }

        if(position != -1){
            System.out.println("Element found at position " + position);
        }
        else{
            System.out.println("Element not found");
        }

    }
}
