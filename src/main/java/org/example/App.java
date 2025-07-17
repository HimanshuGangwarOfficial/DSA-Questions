package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee3 = new Employee("Rakesh", 28, "IT");
        Employee employee5 = new Employee("syx", 30, "IT");
        Employee employee6 = new Employee("fgfsg", 31, "IT");
        Employee employee1 = new Employee("Himanshu", 26, "IT");
        Employee employee2 = new Employee("Saurabh", 27, "IT");
        Employee employee4 = new Employee("abc", 29, "IT");



        List<Employee> list = new ArrayList<>();
        list.add(employee6);
        list.add(employee5);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);


        List<Employee> ans = list.stream()
                .sorted(Comparator.comparing(Employee::getName)
                        .thenComparingInt(Employee::getAge))
                .collect(
                Collectors.toList()
        );


        ans.forEach(System.out::println);



    }
}

















