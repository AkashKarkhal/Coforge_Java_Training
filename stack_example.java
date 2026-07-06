import java.util.Stack;

public class stack_example {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.add(10);
        stack.add(20);
        stack.push(30);
        stack.push(40);

        // for(int i =0; i < stack.size(); i++){
        //     if(stack.get(i)== 30){
        //         System.out.println(" Element found at index number: " + i);
        //     }
        // }

        // search() returns position from TOP of stack
        // System.out.println(stack.search(10));

        // Add 10 random numbers
        // for (int i = 1; i <= 10; i++) {
        //     stack.add((int) Math.round(Math.random() * 10));
        // }
        // System.out.println(stack);



        // push() -> add element at top
        stack.push(50);
        System.out.println("After push: " + stack);

        // peek() -> view top element
        // does not remove it
        System.out.println("Top Element: " + stack.peek());

        // pop() -> remove top element
        // and also return it
        int removed = stack.pop();
        System.out.println("Removed Element: " + removed);
        System.out.println("After pop: " + stack);

        // search() -> position from TOP
        // =========================
        System.out.println("Position of 20 from top: " + stack.search(20));

        // empty() -> checks stack empty or not
        System.out.println("Is Stack Empty? " + stack.empty());

        // size() -> number of elements
        System.out.println("Stack Size: " + stack.size());

        // contains() -> check element exists
        System.out.println("Contains 30? " + stack.contains(30));

        // get() -> get element by index
        // Stack inherits this from Vector
        System.out.println("Element at index 1: " + stack.get(1));
    }
}