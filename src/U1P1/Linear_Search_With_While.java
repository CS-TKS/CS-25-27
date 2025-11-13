package U1P1;

public class Linear_Search_With_While {

    public static void main(String[] args) {
        int[] numbers = {7,9,3,4,2};
        int target = 5;
        int position = -1;
        int i = 0;

        while(position == -1 && i<numbers.length){
            if (numbers[i] == target){
                position = i;

            }
            i++;
        }
        if(position != -1){
            System.out.println("Element found at position " + position);
        }
        else{
            System.out.println("Element not found");
        }

    }
}
