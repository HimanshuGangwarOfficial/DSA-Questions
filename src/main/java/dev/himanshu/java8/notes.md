## Functional Interface Exercise

### 1. Filtering Colletions

Create a program that filters a list of employees based on various conditions using the `Predicate` functional interface.

Requirements:
- Define an `Employee` class with fields such as `name`, `age`, `salary`, etc.
- Create a list of `Employee` objects.
- Use `Predicate<Employee>` to filter employees based on different conditions:
- Age greater than 30.
- Salary greater than a certain threshold.
- Employees with a name that starts with a particular letter.
- Use `Predicate.and()`, `Predicate.or()`, and `Predicate.negate()` to combine multiple conditions.

Allow users to enter the filter condition dynamically (e.g., through input) and apply it.