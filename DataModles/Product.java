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

    public String getName() {return this.name;}
    public double getPrice() {return this.price;}
    public String getCategory() {return this.category;}
    public int getStockQuantity() {return this.stockQuantity;}



}
