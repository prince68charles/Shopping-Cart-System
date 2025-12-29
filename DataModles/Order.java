package DataModles;
import java.time.LocalDate;
import java.util.List;

public class Order {

    String orderId;
    Customer customer;
    List<CartItem> items;
    LocalDate orderTime;


    public Order(String orderId, Customer customer, List<CartItem> itmes, LocalDate orderTime) {

        this.orderId = orderId;
        this.customer = customer;
        this.items = itmes;
        this.orderTime =  orderTime;


    }


}
