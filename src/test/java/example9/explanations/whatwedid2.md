The author's decision to modify the times() method in both the Franc and Dollar classes 
to return a Money type has several important reasons and benefits:

1. Type Safety and Flexibility
Having both methods return a Money type ensures consistency in the return types of these methods. 
This situation makes the code generally more flexible. 
For example, other parts of the code working with these methods can perform their operations 
without having to know the exact return type. 
This provides more flexibility for future developments, such as adding different currencies 
or modifying existing operations.

2. Reducing Code Duplication
The presence of similar code in the Franc and Dollar classes leads to code duplication. 
By having the times() method return a Money type, 
the author consolidates the similar functionalities of these methods into a general type. 
Thus, it is not necessary to write these methods separately for each currency class. 
The same functionality can be centrally managed in the Money class, 
which facilitates maintenance of the code and reduces the likelihood of errors.

3. Refactoring and Abstraction
This approach allows for higher-level abstraction and better organization of the code. 
The Money class can represent the common behaviors of subclasses like Franc and Dollar, 
thus the differences between these classes can be more clearly delineated. 
This means that changes to the system, when necessary, 
may be sufficient with modifications in the Money class in general, rather than just the relevant subclasses.

4. Broader Application Possibilities
If the system is going to perform conversions or calculations between different currencies, 
a times() method that returns a Money type facilitates such transformations. 
For example, if it is necessary to work with different currencies during a transaction, 
transitioning between subclasses of the Money class becomes simpler.

Conclusion
This change serves the author's goal of creating a cleaner, 
more modular, and more sustainable code base. 
Returning the Money class, instead of specific classes like Franc and Dollar, 
uses a more general structure that better adapts the system to various scenarios.