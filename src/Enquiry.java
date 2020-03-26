public class Enquiry {
    private Customer customer;
    private Category category;

    public Category getCategory() {
        return category;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Enquiry(Customer customer, Category category) {
        this.customer = customer;
        this.category = category;
    }

}
