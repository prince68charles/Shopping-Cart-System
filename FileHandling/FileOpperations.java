package FileHandling;
import DataModles.Order;
import DataModles.Product;
import FunctionalOpperations.Opperations;
import java.io.*;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;


public class FileOpperations {

    public static class FileReading implements Opperations {

        //This can act as a reader for both customers and products
        Function<File, List<String> readFromCSV = file -> {

          try(BufferedReader reader = new BufferedReader(new FileReader(file))) {

              return reader.lines().toList();
          }
          catch (IOException e) {throw new RuntimeException(e);}
        };
    }

    public static class FileWriting implements Opperations {

        Consumer<Product> productWrite = product -> {

            try (FileWriter productWriter = new FileWriter("products.txt", true)){
                productWriter.write(productToCSV.apply(product));
                productWriter.write("\n");

            }
            catch(IOException e){throw new RuntimeException(e);}
        };

        //Store order by ID
        Consumer<Order> orderWrite = order -> {

            try(FileWriter orderWriter = new FileWriter("order_history.txt", true)) {
                orderWriter.write(orderToCSv.apply(order));
                orderWriter.write("\n");
            }
            catch (IOException e) {throw new RuntimeException(e);}

        };

        BiConsumer<List<Product>, File> productsWrite = ((products, file) -> {

            try (FileWriter productsWriter = new FileWriter(file, true)) {

                products.stream().map(productToCSV).
                        forEach(line -> {
                            try {productsWriter.write(line + "\n");
                            } catch (IOException e) {throw new RuntimeException(e);}

                        });
            }
            catch (IOException e) {

                throw new RuntimeException(e);
            }

        });

    }



}



