package dev.himanshu.java8.functionalInterfaces.MappingChaining;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FunctionDemoTest {

    private final FunctionDemo functionDemo = new FunctionDemo();

    @Test
    @DisplayName("Test: Process list with valid, empty, null strings")
    void testProcessWithVariousInputs() {
        List<String> inputStrings = Arrays.asList("   Alice   ", "Bob", "  Charlie   ", "", null, " David ");
        List<Integer> expectedLengths = Arrays.asList(5, 3, 7, 0, 0, 5);

        List<Integer> actualLengths = functionDemo.process(inputStrings);

        assertEquals(expectedLengths, actualLengths, "The processed lengths should match the expected values.");
    }

    @Test
    @DisplayName("Test: Process empty list")
    void testProcessWithEmptyList(){

        List<String> inputList = List.of();
        List<Integer> expectedLengths = List.of();

        List<Integer> actualLengths = functionDemo.process(inputList);

        assertEquals(actualLengths, expectedLengths, "An empty list should result in an empty output list.");
    }

}