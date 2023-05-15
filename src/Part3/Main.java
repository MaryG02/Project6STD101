package Part3;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Queue before: " + queue.toString());
        queue.dequeue();
        System.out.println("Queue after: " + queue.toString());

    }
}
