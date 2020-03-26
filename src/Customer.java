public class Customer {

    private String name;

    Customer (String name) {
        this.name = name;
    }
    public static final Customer JACK = new Customer("Jack");
    public static final Customer JILL = new Customer("Jill");
    public static final Customer MARY = new Customer("Mary");

    public void reply(final String message) {
        System.out.printf(name, message);
    }

}
