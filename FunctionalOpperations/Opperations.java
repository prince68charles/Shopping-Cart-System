package FunctionalOpperations;

import DataModles.CartItem;
import java.util.function.Function;
;

public interface Opperations {


   Function<CartItem, Double> getTotalPrice = product -> product.getPrice() * product.getQuantity();



   
}
