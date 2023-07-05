package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

    public static void main(String[] args) {

        List<Customer> customerList = Arrays.asList(
                new Customer("Tom", 30),
                new Customer("Steve", 31),
                new Customer("Peter", 34),
                new Customer("Simon", 23)

        );

        String name = customerList.stream().
                filter(x -> "Peter".equals(x.getName()))
                .map(Customer::getName)
                .findAny()
                .orElse(null);




       List<String> customers=customerList.stream().map(Customer::getName).collect(Collectors.toList());
               customers.forEach(System.out::println);


    }

}
