package DataModles;
import java.time.LocalDate;
import java.util.List;

public class Order {

    String orderId;
    Customer customer;
    List<CartItem> items;
    LocalDate orderTime;


    public Order(String orderId, Customer customer, List<CartItem> items, LocalDate orderTime) {

        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        this.orderTime =  orderTime;


    }

    public String getOrderId() {return this.orderId;}
    public Customer getCustomerInfo() {return this.customer;}
    public List<CartItem> getItems() {return this.items;}
    public LocalDate getOrderTime() {return this.orderTime;}


}
