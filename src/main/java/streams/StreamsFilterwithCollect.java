package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterwithCollect {

    public static void main(String[] args) {

        List<String> productList = Arrays.asList("Macbook", "iphone", "Shoes", "Battery");

        List<String> result = productList.stream().filter(ele -> !ele.equals("Shoes")).collect(Collectors.toList());

        result.forEach(ele->System.out.println(ele));
        result.forEach(System.out::println);


    }


}
