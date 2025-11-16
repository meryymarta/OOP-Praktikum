
package quiz2;

import java.util.Date;

public abstract class Order {
    private Date orderDate;

    public Order(){
        this.orderDate = new Date();
    }

    public Date getOrderDate(){
        return orderDate;
    }

    public abstract void confirm();

    public void info() {
        System.out.println("Order create at: " + orderDate.toString());
    }
    
}
