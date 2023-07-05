package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {


       ArrayList al = new ArrayList();
       al.add("X");
       al.add("Y");
       al.add("A");
       al.add("B");
       al.add("C");

       ArrayList al_dup = new ArrayList();
       al_dup.addAll(al);
       System.out.println(al_dup);
       al_dup.removeAll(al);
       System.out.println("after removing "+al_dup);


       Collections.sort(al);
       System.out.println("elements in array list after sorting "+al);
       Collections.sort(al,Collections.reverseOrder());
       System.out.println("elements in array after sorting in reversed order "+al);

       // shuffling
       Collections.shuffle(al);
       System.out.println("elements in array list after shuffling "+al);


    }



}
