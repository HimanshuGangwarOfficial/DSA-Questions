package dev.himanshu.java8.functionalInterfaces.ProcessingData;

import dev.himanshu.java8.functionalInterfaces.util.Product;
import dev.himanshu.java8.functionalInterfaces.util.ProductRepository;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        List<Product> products = ProductRepository.getAllProducts();

        processData(products);

    }

    public static void processData(List<Product> products){

        Consumer<Product> increasePriceAndPrintName = (product)->{
            // Increase price based on category-specific criteria
            if ("Electronics".equalsIgnoreCase(product.getCategory()) && product.getPrice() > 500) {
                product.setPrice(product.getPrice() * 1.10); // Increase by 10%
            } else if ("Clothing".equalsIgnoreCase(product.getCategory())) {
                product.setPrice(product.getPrice() * 1.05); // Increase by 5%
            } else if ("Furniture".equalsIgnoreCase(product.getCategory())) {
                product.setPrice(product.getPrice() * 1.08); // Increase by 8%
            }

            System.out.println(product.getName());
        };

        products.forEach(increasePriceAndPrintName);

        double totalPrice = products.stream().mapToDouble(Product::getPrice).sum();
        System.out.println(Math.round(totalPrice*100.0)/100.0);
    }

}
