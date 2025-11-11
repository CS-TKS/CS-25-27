package U1P1;
import java.util.Stack;
public class Stacks {

    public static void main(String[] args) {

        Stack<String> myStack = new Stack<String>();

        System.out.println(myStack);
        myStack.push("Ralph");
        System.out.println(myStack);
        myStack.push("Sophie");
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack);

        System.out.println("Hello World");
    }
}
