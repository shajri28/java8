package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

    public static void main(String[] args) {


        LinkedList l = new LinkedList();
        l.add(100);
        l.add("welcome");
        l.add(15.5);
        l.add('A');
        l.add(true);
        l.add(null);

        System.out.println(l);
        System.out.println(l.size());

        //remove
        l.remove(3);

        System.out.println("after removing , new list" + l);

        // insert adding element in the middle of linked list

        l.add(3, "java");
        System.out.println("after inserting element , new list" + l);

        // retrieving value object
        System.out.println(l.get(3));

        // change the value
        l.set(5, "X");
        System.out.println("After changing the value:" + l);

        //contains
        System.out.println(l.contains("java"));
        System.out.println(l.contains("python"));

        //is empty

        System.out.println(l.isEmpty());

        // reading elements from linked list using for loop

        for (int i = 0; i < l.size(); i++) {

            System.out.println(l.get(i));
        }

        // reading elements from linked list using for..each loop

        for (Object e : l) {
            System.out.println(e);

        }

        // reading elements from linked list using iterator

        Iterator it = l.iterator();
        while (it.hasNext()) {

            System.out.println(it.next());

        }


    }
}
