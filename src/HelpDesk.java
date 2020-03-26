import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {

    private final Queue<Enquiry> enquires = new ArrayDeque<>();

    public void enquire(Customer customer, Category category) {
        enquires.offer(new Enquiry(Customer.JACK, Category.PRINTER));
    }

    public void processAllEnquires() {
        final Enquiry enquiry = enquires.poll();
        enquiry.getCustomer().reply(": turn off and on again");
    }

}
