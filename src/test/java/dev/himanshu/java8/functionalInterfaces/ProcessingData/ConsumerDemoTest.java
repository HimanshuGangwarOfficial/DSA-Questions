package dev.himanshu.java8.functionalInterfaces.ProcessingData;

import dev.himanshu.java8.functionalInterfaces.util.Product;
import dev.himanshu.java8.functionalInterfaces.util.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsumerDemoTest {

    private List<Product> products;

    @BeforeEach
    public void init(){
        products = ProductRepository.getAllProducts();
    }

    @Test
    @DisplayName("Test: Check total price correctness after price modified")
    public void testTotalPriceAfterProcessing(){

        ConsumerDemo.processData(products);
        double expectedTotalPrice = 1862.05;
        double actualTotalPrice = products.stream().mapToDouble(Product::getPrice).map(price->Math.round(price * 100.0) / 100.0).sum();

        assertEquals(expectedTotalPrice, actualTotalPrice,"Expected price and Actual price should be equal");
    }

    @Test
    @DisplayName("Test: Check modified prices")
    public void testModifiedProcess(){
        List<Double> expectedPrices = List.of(880.0, 660.0, 26.25, 42.0, 162.0, 91.8);
        ConsumerDemo.processData(products);

        List<Double> actualPrices = products.stream().map(Product::getPrice).map(price->Math.round(price * 100.0) / 100.0).toList();

        assertEquals(expectedPrices, actualPrices,"Expected prices and Actual prices should be equal");
    }

}