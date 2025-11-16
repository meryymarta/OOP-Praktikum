package quiz2;

public class DemoSoal2 {
    public static void main(String[] args) {
        MailOrder mail = new MailOrder();
        WebOrder web = new WebOrder();
        WhatsappOrder wa = new WhatsappOrder();

        System.out.println("=== Order Process ===");

        System.out.println("Date Information");
        mail.info();
        web.info();
        wa.info();
        System.out.println();

        System.out.println("Order Confirmation");
        mail.confirm();
        web.confirm();
        wa.confirm();
        System.out.println();

        System.out.println("Status Tracked");
        mail.trackStatus();
        web.trackStatus();
    }
    
}
