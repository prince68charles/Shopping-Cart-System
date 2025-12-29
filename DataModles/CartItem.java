package DataModles;

public class CartItem extends Product{

    Product product;
    int quantity;


    public CartItem(Product product, int quantity) {
        super(product.name, product.price, product.category, product.stockQuantity);

        this.product = product;
        this.quantity = quantity;

    }

    public Product getProduct() {return this.product;}
    public int getQuantity() {return this.quantity;}





}
