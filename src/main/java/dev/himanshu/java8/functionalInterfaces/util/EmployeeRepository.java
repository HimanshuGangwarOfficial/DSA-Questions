package dev.himanshu.java8.functionalInterfaces.util;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    private static final List<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Employee("Himanshu", 29, 130000));
        employeeList.add(new Employee("Nishant", 27, 90000));
        employeeList.add(new Employee("Aryan", 32, 150000));
        employeeList.add(new Employee("Advik", 22, 30000));
        employeeList.add(new Employee("Mohan", 33, 160000));
        employeeList.add(new Employee("Kapil", 27, 20000));
        employeeList.add(new Employee("Arun", 30, 50000));
        employeeList.add(new Employee("Anuj", 7, 90000));
        employeeList.add(new Employee("Amrita", 32, 100000));
        employeeList.add(new Employee("Abhishek", 29, 120000));
        employeeList.add(new Employee("Alice", 28, 60000));
        employeeList.add(new Employee("Bob", 35, 55000));
        employeeList.add(new Employee("Charlie", 42, 70000));
        employeeList.add(new Employee("Diana", 25, 52000));
        employeeList.add(new Employee("Eve", 31, 65000));
    }

    public static List<Employee> getAllEmployees(){
            return employeeList;
    }
}
