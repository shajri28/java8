package flatmap;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIngArrayWithFlatMap {

    public static void main(String[] args) {


        int data[]={1,2,3,4,5,6,7,8,9};
        Stream<int[]> streamArray=Stream.of(data);
        IntStream intstream=streamArray.flatMapToInt(x-> Arrays.stream(x));
        intstream.forEach(x->System.out.println(x));


    }

}
