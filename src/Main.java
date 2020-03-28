public class Main {
    // offer vs add
    // poll vs remove
    // peek vs element

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.TABLET);
        helpDesk.enquire(Customer.MARY, Category.PRINTER);
        helpDesk.processAllEnquires();
    }


}
