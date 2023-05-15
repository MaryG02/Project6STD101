package Part2;
import java.util.LinkedList;

public class Stack<T> extends LinkedList<T> {
    public void push(T item) {
        this.addFirst(item);
    }

    public T pop() {
        if (this.isEmpty()){
            return null;
        }
        else{
            T item = getFirst();
            removeFirst();
            return item;
        }
    }
}
