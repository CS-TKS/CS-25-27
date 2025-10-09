package U1P1;

public class Array_six_values {
    public static void main(String[] args) {
        int myArray[] = {21,34,23,36,93,31};
        int i =0;
        while(i<myArray.length){

            System.out.println(myArray[i]);
            i++;

        }

        if(myArray[0]==myArray[myArray.length-1]){
            System.out.println("True");
        }
    }
}
