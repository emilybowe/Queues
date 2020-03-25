public class Main {
    // offer vs add
    // poll vs remove
    // peek vs element

    public static void Main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.enquire(Customer.JACK, Category.PRINTER);
        helpDesk.processAllEnquires();
    }


}
