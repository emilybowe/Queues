import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class HelpDesk {

    private final Queue<Enquiry> enquires = new PriorityQueue<>();

    public void enquire(Customer customer, Category category) {
        enquires.offer(new Enquiry(customer, category));
    }

    public void processAllEnquires() {
        while (!enquires.isEmpty()) {
            Enquiry enquiry = enquires.poll();
            enquiry.getCustomer().reply(": turn off and on again");
        }

    }

}
