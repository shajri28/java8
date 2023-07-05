package flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsSetWithFlatMap {

    public static void main(String[] args) {
        Employee emp1= new Employee();
        emp1.setName("Sabrine");
        emp1.addDevices("iphone");
        emp1.addDevices("mac");
        emp1.addDevices("android");

        Employee emp2= new Employee();
        emp2.setName("Tom");
        emp2.addDevices("iphone");
        emp2.addDevices("Unix");
        emp2.addDevices("samsung 1o");

         List<Employee> emplists= new ArrayList<Employee>();
        emplists.add(emp1);
        emplists.add(emp2);
        List<String> devicesList= emplists.stream()
                .map(x->x.getDevices())
                .flatMap(x->x.stream())
                .distinct()
                .collect(Collectors.toList());

        devicesList.forEach(x->System.out.println(x));

    }
}
