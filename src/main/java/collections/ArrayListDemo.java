package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayListDemo {

    public static void main(String[] args) {


       ArrayList a1 = new ArrayList();
       a1.add(100);
       a1.add("welcome");
       a1.add(15.5);
       a1.add('A');
       a1.add(true);

       System.out.println(a1);
       System.out.println("number of elements of array: " + a1.size());

       a1.remove(1);
       System.out.println("after removing element from array list" +a1);

       a1.add(2,"Python");
       System.out.println("after insertion " +a1);

       System.out.println(a1.get(2));

       a1.set(2, "C#");

       System.out.println("after replacing with new element" +a1);


       a1.contains("C#");

       System.out.println(a1.isEmpty());

       // 1) for loop
       System.out.println("Reading elements using for loop");

       for(int i=0; i<=a1.size()-1; i++){

          System.out.println(a1.get(i));

       }
       // 2) for  each loop
       System.out.println("Reading elements using for each loop");
       for (Object e:a1){

          System.out.println(e);

       }

       // 3) iterator
       System.out.println("Reading elements using for iterator");
       Iterator it = a1.iterator();

       while(it.hasNext()){
          System.out.println(it.next());


       }



    }



}
