package dev.himanshu.java8.functionalInterfaces.FilteringColletions;

import dev.himanshu.java8.functionalInterfaces.util.Employee;
import dev.himanshu.java8.functionalInterfaces.util.EmployeeRepository;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeRepository.getAllEmployees();

        Predicate<Employee> ageGreaterThan30 = (employee)->employee.getAge()>30;
        Predicate<Employee> salaryGreaterThan90k = (employee) -> employee.getSalary()>90000;
        Predicate<Employee> nameStartsWithA = (employee) -> employee.getName().startsWith("A");


        Predicate<Employee> finalFilter = getEmployeePredicate(ageGreaterThan30, salaryGreaterThan90k, nameStartsWithA);

        employeeList.stream().filter(finalFilter).forEach(System.out::println);


    }

    private static Predicate<Employee> getEmployeePredicate(Predicate<Employee> ageGreaterThan30, Predicate<Employee> salaryGreaterThan90k, Predicate<Employee> nameStartsWithA) {
        int choice = 9;
        return switch (choice){
            case 1 ->  ageGreaterThan30;
            case 2 ->  salaryGreaterThan90k;
            case 3 ->  nameStartsWithA;
            case 4 ->  ageGreaterThan30.and(salaryGreaterThan90k);
            case 5 ->  ageGreaterThan30.and(nameStartsWithA);
            case 6 ->  salaryGreaterThan90k.and(nameStartsWithA);
            case 7 ->  salaryGreaterThan90k.and(ageGreaterThan30);
            case 8 ->  salaryGreaterThan90k.and(ageGreaterThan30).and(nameStartsWithA);
            default -> (employee)->true;
        };

    }
}
