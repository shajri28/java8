package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterFindAnyAndOrElse {

    public static void main(String[] args) {

        List<Customer> customerList = Arrays.asList(
                new Customer("Tom", 30),
                new Customer("Steve", 31),
                new Customer("Peter", 34),
                new Customer("Simon", 23)

        );
        Customer customer = customerList.stream().
                filter(x -> "Peter".equals(x.getName()))
                .findAny()
                .orElse(null);





        Customer customer2 = customerList.stream()
                .filter(x -> "Simon".equals(x.getName()) && 23 == x.getAge())
                .findAny()
                .orElse(null);
        System.out.println(customer2.getName());

    }


}
