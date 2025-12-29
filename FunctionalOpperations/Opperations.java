package FunctionalOpperations;

import DataModles.CartItem;

import java.util.function.BiFunction;
import java.util.function.Function;
import DataModles.Product;
import DataModles.Customer;

public interface Opperations {


   Function<CartItem, Double> getTotalPrice = product ->
           product.getPrice() * product.getQuantity();

    BiFunction<Double,Double, Double> applyExchangeRate = (price, exchangeRate) -> price * exchangeRate;

    BiFunction<Product, Integer, Boolean> itemAvaible = (product, requestedQuantity) ->
            product.getStockQuantity() >= requestedQuantity;


    Function<CartItem, Double> finalPrice = item ->
            applyExchangeRate.apply(getTotalPrice.apply(item), 1.13);

    //Convert product to CSV
    Function<Product, String> productToCSV = product ->
            String.join(",",
                    product.getName(),
                    String.valueOf(product.getPrice()),
                    product.getCategory(),
                    String.valueOf(product.getStockQuantity())
            );


    BiFunction<Customer, Double, Double> applyPointsToMember = ((customer, price) -> {


        if(customer.getLevel().equals(Customer.MembershipLevel.GOLD)) return price/2;
        if(customer.getLevel().equals(Customer.MembershipLevel.SILVER)) return price/3;
        if(customer.getLevel().equals(Customer.MembershipLevel.BASIC)) return price/4;

        return null;
    });

    //Merge Two carts if they are the same product
    BiFunction<CartItem, CartItem, CartItem> mergeTwoCarts = (cartOne, cartTwo) -> {

        if(cartOne.getName().equalsIgnoreCase(cartTwo.getName())) {

            return new CartItem(cartOne, cartOne.getQuantity()+ cartTwo.getQuantity());

        } else{return null;}

    };



    


}
