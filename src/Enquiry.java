public class Enquiry {
    private final Customer customer;
    private final Category category;

    public Category getCategory() {
        return category;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Enquiry(final Customer customer, final Category category) {
        this.customer = customer;
        this.category = category;
    }
}
