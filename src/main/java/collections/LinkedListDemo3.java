package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo3 {

    public static void main(String[] args) {


        LinkedList l = new LinkedList();
        l.add("dog");
        l.add("cat");
        l.add("horse");


        System.out.println(l);
        l.addFirst("Tiger");
        l.addLast("Elephant");

        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());

        l.removeFirst();
        l.removeLast();
        System.out.println("after removing first and last elements" + l);


    }
}
