package ProcessingAndAnalyicts;
import DataModles.Product;
import DataModles.CartItem;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import DataModles.Order;
import java.util.Optional;
public class DataGathering {


    public static List<Product> findProductByCategory(List<Product> products, String category) {

        return products.stream().filter(
                product -> product.getCategory().equals(category))
                .sorted(Comparator.comparing(Product::getPrice)).toList();

    }

    public static double totalValueOfCart(List<CartItem> cart) {


        return cart.stream()
                .map(Product::getPrice)
                .reduce(0.0,
                Double::sum);


    }

    public static List<Product> topFiveMostExpensive (List<Product> inventory) {

        return inventory.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .limit(5)
                .toList();


    }

    public static Map<String, Long> groupByCategories(List<Product> inventory) {


        return inventory.stream()
                .collect(Collectors.groupingBy
                        (Product::getCategory, Collectors.counting()));

    }

    public static List<Product> lowStockProducts(List<Product> inventory) {

        return inventory.stream().filter(product ->
                product.getStockQuantity() < 10)
                .toList();

    }

    public static List<Product> productsPurchased(List<Order> orders) {

        return orders.stream().
                flatMap(order ->
                        order.getItems().stream()
                        .map(CartItem::getProduct))
                        .toList();
    }
}
