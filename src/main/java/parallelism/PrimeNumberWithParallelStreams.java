package parallelism;

import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStreams {



    public static void main(String[] args) {

      long count = Stream.iterate(0,n->n+1).limit(1000000)
              .filter(PrimeNumberWithParallelStreams::isPrime)
              .parallel()
              .peek(x->System.out.println(x))
              .count();


     System.out.println("total prime number: "+count);


    }


    public static boolean isPrime(int number){

    if (number <=1){
        return false;
    }
    return !IntStream.rangeClosed(2,number/2).anyMatch(x->number%x == 0);




    }



}
