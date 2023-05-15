package Part1;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // testing add to the end method
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(5);
        System.out.println("List1: " + list.toString());
        //testing add at index method
        list.add(3, 2);
        // testing addFirst method
        list.addFirst(5);
        System.out.println("List1 after adding: " + list.toString());
        //testing list get
        System.out.println("Element with index two is: "+list.get(2));
        // testing removeAll
        list.removeAll(3);
        System.out.println("List after removing all the 3: " + list.toString());


        LinkedList<String> list2 = new LinkedList<>();

        list2.add("One");
        list2.add("Two");
        list2.add("Three");
        list2.add("Four");
        list2.add("Five");

        System.out.println("List2 before remove: "+ list2.toString());
        //testing remove at index
        list2.remove(3);
        // testing remove element e
        list2.remove("One");

        System.out.println("List2 after remove: "+ list2.toString());
        // testing getSize
        System.out.println("Size of the list is: " + list2.getSize());


    }

}
