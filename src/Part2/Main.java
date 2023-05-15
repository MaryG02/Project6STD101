package Part2;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(5);
        stack1.push(13);
        stack1.push(18);
        stack1.push(1);
        System.out.println("Stack before: " + stack1.toString());
        stack1.pop();
        System.out.println("Stack after: " + stack1.toString());
    }
}
