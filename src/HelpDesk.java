import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {

    private final Queue<Enquiry> enquires = new ArrayDeque<>();

    public void enquire(Customer customer, Category category) {
        enquires.offer(new Enquiry(customer, category));
    }

    public void processAllEnquires() {
        while (!enquires.isEmpty()) {
            Enquiry enquiry = enquires.remove();
            enquiry.getCustomer().reply(": turn off and on again");
        }

    }

}
