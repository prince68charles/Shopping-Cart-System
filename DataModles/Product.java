package DataModles;

public class Product {

    String name;
    double price;
    String category;
    int stockQuantity;



    Product(String name, double price, String category, int stockQuantity) {


        this.name = name;
        this.price = price;
        this.category = category;
        this.stockQuantity = stockQuantity;

    }

    String getName() {return this.name;}
    double getPrice() {return this.price;}
    String getCategory() {return this.category;}
    int getStockQuantity() {return this.stockQuantity;}



}
