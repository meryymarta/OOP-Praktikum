package quiz2;

public class MailOrder extends Order implements Trackable{
    public MailOrder(){
        super();
    }

    @Override
    public void confirm() {
        System.out.println("MAIL ORDER: the confirmaton send through email");
    }

    @Override
    public void trackStatus(){
        System.out.println("MAIL ORDER: Status trancked via courier system. Pacakge has been processed");
    }
    
}
