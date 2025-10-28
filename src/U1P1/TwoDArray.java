package U1P1;

public class TwoDArray {

    public static void main(String[] args) {

        int numbers[][] = new int[4][3];

        System.out.println(numbers[0].length);

        int count = 1;
        for(int i = 0; i<numbers.length; i++){
            for(int j = 0; j<numbers[i].length; j++){
                numbers[i][j] = count;
                count++;
            }
        }

        //numbers[2][1] = 8;

        for(int i = 0; i<numbers.length; i++){
            for(int j = 0; j<numbers[i].length; j++){
                System.out.print(numbers[i][j]+" ");

            }
            System.out.println();
        }


       // System.out.println(numbers[0][0]);
       // System.out.println(numbers[2][1]);

    }
}
