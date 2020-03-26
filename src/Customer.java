public class Customer {

    private String name;

    public Customer (String name) {
        this.name = name;
    }
    public static Customer JACK = new Customer("Jack");
    public static Customer JILL = new Customer("Jill");
    public static Customer MARY = new Customer("Mary");

    public void reply(String message) {
        System.out.println(name + message);
    }

}
