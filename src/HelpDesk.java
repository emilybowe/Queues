import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class HelpDesk {

    private static final Comparator<Enquiry> BY_CATEGORY = new Comparator<Enquiry>() {
        @Override
        public int compare(Enquiry o1, Enquiry o2) {
            return o1.getCategory().compareTo(o2.getCategory());
        }
    };

    private Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

    public void enquire(Customer customer, Category category) {
        enquiries.offer(new Enquiry(customer, category));
    }

    public void processAllEnquires() {
        Enquiry enquiry;
        while ((enquiry = enquiries.poll()) != null) {
            enquiry.getCustomer().reply(": turn off and on again");
        }
    }
}
