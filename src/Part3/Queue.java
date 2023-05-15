package Part3;
import java.util.LinkedList;

public class Queue<T> extends LinkedList<T> {
    public void enqueue(T item) {
        addLast(item);
    }

    public T dequeue() {
        T item = getFirst();
        removeFirst();
        return item;
    }

}
