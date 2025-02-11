import java.util.Stack;

public class Main {

    public static void main(String[] args)
    {

        Stack myStack= new Stack<>();

        System.out.println("Is my stack empty? " + myStack.empty());
// pushing elements into stack
        myStack.add("Orange Ball");
        myStack.add("Violet Ball");
        myStack.add("Green Ball");

//prints elements of the stack
        System.out.println("Elements in Stack: " + myStack.toString());
        System.out.println("Is my stack empty? " + myStack.empty());
        while (!myStack.isEmpty()) {
            myStack.pop();
            System.out.println("Elements in Stack: " + myStack);
            System.out.println("Is my stack empty? " + myStack.empty());
        }
    }
}