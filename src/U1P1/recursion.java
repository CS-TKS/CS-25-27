package U1P1;

public class recursion {

    public static void main(String[] args) {
        pyramid(10);
    }
public static int fibonnacci(int n){
        
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
