package quiz2;

public class WhatsappOrder extends Order {
    public WhatsappOrder(){
        super();
    }

@Override
public void confirm(){
    System.out.println("WA ORDER:Confirmation sent Via Whatsapp message customers ");
}
    
}
