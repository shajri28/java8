package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpAndMethodReference {

    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Tome", "Peter", "Naveen", "Simon");
        namesList.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);

            }
        });

        namesList.forEach(str -> System.out.println(str));


        namesList.forEach(System.out::println);
    }


}
