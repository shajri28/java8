package streams;

public class Customer {

    private String name;
    private int age;
    public Customer(String name,int age){

       this.age=age;
       this.name=name;


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
