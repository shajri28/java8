package flatmap;

import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamsWithStringArrayFlatMap {


    public static void main(String[] args) {
        String data[][] = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Stream<String[]> dataStream = Arrays.stream(data);

        //apply flat map
        Stream<String> streamFlatmap = dataStream.flatMap(x -> Arrays.stream(x));
        Stream<String> dataStreamFilter = streamFlatmap.filter(x -> "a".equals(x.toString()));
        dataStreamFilter.forEach(System.out::println);
        Stream<String> finalStream = Arrays.stream(data).
                flatMap(x -> Arrays.stream(x)).
                filter(x -> "a".equals(x.toString()));
        finalStream.forEach(System.out::println);

    }
}
