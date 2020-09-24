package nl.novi.javaprogrammeren;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Wereld!");

        Person p = new Person("Jan");
        House h = new House("DaStreet", 42,p);



        System.out.println(p.getName());
    }
}
