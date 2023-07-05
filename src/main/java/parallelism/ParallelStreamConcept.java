package parallelism;

import java.util.Arrays;
import java.util.List;
import java.util.stream.BaseStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamConcept {

    public static void main(String[] args) {

       Stream stream= Stream.of("Naveen","Tom","Selvin","Peter","Raj","Simon");
        BaseStream parallelStream= stream.parallel();


    }
}
