package dev.himanshu.java8.functionalInterfaces.MappingChaining;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        FunctionDemo functionDemo = new FunctionDemo();
        List<String> strings = Arrays.asList("   Alice   ", "Bob", "  Charlie   ", "", null, " David ");
        List<Integer> result = functionDemo.process(strings);
        result.forEach(System.out::println);
    }

    public List<Integer> process(List<String> strings) {

        Function<String, Integer> combineResult = applyActions();

        return strings.stream().map(combineResult).toList();
    }

    private static Function<String, Integer> applyActions() {
        // Function to convert a string to uppercase and trim spaces
        Function<String, String> toUpperCaseAndTrim = (str) -> {
            if(str == null || str.isBlank()){
                return null;
            }
            return str.toUpperCase().trim();
        };

        // Function to calculate the length of a string
        Function<String, Integer> calculateLength = (str) -> {
            if(str == null || str.isBlank()){
                return 0;
            }
            return str.length();
        };

        // Chaining the functions using andThen and return
        return toUpperCaseAndTrim.andThen(calculateLength);
    }
}
