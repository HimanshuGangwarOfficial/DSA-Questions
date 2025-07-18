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

### 2. Mapping and Chaining

Implement a system that processes a list of strings and transforms them into uppercase, trims them, and calculates the length of each string using `Function`.

Requirements:
- Create a list of strings (e.g., names or sentences).
- Use `Function<String, String>` to:
- Convert each string to uppercase.
- Trim any extra spaces.
- Use `Function<String, Integer>` to calculate the length of each string after applying the transformations.
- Chain the functions using `andThen()` and `compose()` methods.

Implement error handling for empty strings and null values in the list.

### 3. Process Data in Stream

Implement a consumer that processes and modifies a collection of objects (e.g., list of products) and prints the results using `Consumer`.

Requirements:
- Define a `Product` class with fields such as `name`, `price`, and `category`.
- Create a list of `Product` objects.
- Use `Consumer<Product>` to perform the following operations:
- Increase the price of products based on certain criteria (e.g., category, price threshold).
- Print the names of products after modifying them.
- Use the `forEach()` method in a stream to process the products.

Implement a system that calculates the total value of modified products and prints it.