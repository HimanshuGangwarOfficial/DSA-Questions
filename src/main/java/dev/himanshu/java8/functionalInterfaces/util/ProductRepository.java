package dev.himanshu.java8.functionalInterfaces.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRepository {

    private static final List<Product> productList = new ArrayList<>();

    static{
        productList.add(new Product("Laptop", 800.0, "Electronics"));
        productList.add(new Product("Smartphone", 600.0, "Electronics"));
        productList.add(new Product("T-Shirt", 25.0, "Clothing"));
        productList.add(new Product("Jeans", 40.0, "Clothing"));
        productList.add(new Product("Table", 150.0, "Furniture"));
        productList.add(new Product("Chair", 85.0, "Furniture"));
    }

    public static List<Product> getAllProducts(){
//        List<Product> deepCopy = new ArrayList<>();
//        for (Product product : productList) {
//            deepCopy.add(new Product(product)); // Use the copy constructor to clone each product
//        }
//        return deepCopy;

        // Use Stream API with Collectors for creating a deep copy
        return productList.stream()
                .map(Product::new) // Use the copy constructor
                .collect(Collectors.toList());
    }


}
