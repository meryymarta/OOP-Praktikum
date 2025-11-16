package quiz2;

public class WebOrder extends Order implements Trackable{
    public WebOrder(){
        super();
    }

@Override
public void confirm(){
    System.out.println("WEB ORDER: Verified automatic confirmation on the website page ");
}

@Override
public void trackStatus(){
    System.out.println("WEB ORDER: Status viewed on the customer account dashboard on the website ");
}
}
