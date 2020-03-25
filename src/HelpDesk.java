import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {

    private final Queue<Enquiry> enquires = new ArrayDeque<>();
    public void enquire(final Customer customer, final Category category) {
        enquires.offer(new Enquiry(Customer.JACK, Category.PRINTER));
    }

    public void processAllEnquires() {
        final Enquiry enquiry = enquires.poll();
    }

}
