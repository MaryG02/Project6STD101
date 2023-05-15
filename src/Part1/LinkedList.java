package Part1;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;


    private static class Node<T>{
        Node<T> prev;
        Node<T> next;
        T e;

        Node(Node<T> prev, T e, Node<T> next){
            this.prev = prev;
            this.next = next;
            this.e = e;
        }
    }
// adds an element to the end of the list
    public void add(T e){
        if (size == 0) {
            first = last = new Node<>(null, e, null);
        } else {
            Node<T> newNode = new Node<>(last, e, null);
            last.next = newNode;
            last = newNode;
        }
        size++;
    }
// adds an element to the specific index
    public void add(T e, int i){
        if (i == 0) {
            addFirst(e);
        }

        else if (i == size) {
            add(e);
        }
        else{
        Node<T> current = getNode(i);
        Node<T> newNode = new Node<>(current.prev, e, current);
        current.prev.next = newNode;
        current.prev = newNode;
        size++;
        }
    }
// adds an element to the beginning of the list
    public void addFirst(T e) {
        if (size == 0) {
            first = last = new Node<>(null, e, null);
        } else {
            Node<T> newNode = new Node<>(null, e, first);
            first.prev = newNode;
            first = newNode;
        }
        size++;
    }

    public T get(int i){
        Node<T> current = getNode(i);
        return current.e;
    }

    public int getSize() {
        return size;
    }

    private Node<T> getNode(int index) {
        Node<T> current = first;
        for (int i=0; i<index; i++){
            current = current.next;
        }
        return current;
    }

    // method to remove node at specific index
    public void remove(int i){
        Node<T> current = first;
        for (int k=0; k<i; k++){
            current = current.next;
        }
        if (current == null){
            return;
        }
        removeNode(current);
    }
// method to remove node
    private void removeNode(Node<T> node) {
        if( node.prev == null){
            first = node.next;
        }
        else{
            node.prev.next = node.next;
        }
        if(node.next == null){
            last = node.prev;
        }
        else{
            node.next.prev = node.prev;
        }
        size--;
        if (size==0){
            first = null;
            last = null;
        }
    }

    // removes first element that is equal to e
    public void remove(T e){
        Node<T> current = first;
        while (current != null) {
            if (current.e.equals(e)) {
                removeNode(current);
                return;
            }
            current = current.next;
        }
    }

    // removes all elements in the list that are equal to e
    public void removeAll(T e){
        Node<T> current = first;
        while (current != null) {
            if (current.e.equals(e)) {
                Node<T> next = current.next;
                removeNode(current);
                current = next;
            } else {
                current = current.next;
            }
        }
    }

    public String toString(){
        if(first == null){
            return "[ ]";
        }
        String result = "["+ first.e;
        Node<T> current = first.next;
        while(current!= null){
            result += ", "+ current.e;
            current = current.next;
        }
        result += "]";
        return result;
    }
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    }

