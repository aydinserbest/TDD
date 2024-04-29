The "side-effects" mentioned in the text 
refer to a function or method making changes beyond its expected functionality 
or affecting other system states in the context of software development and programming. 
This is particularly relevant in functional programming languages, 
which encourage the use of side-effect-free functions. Side effects often reduce the predictability and testability of the code, 
making them generally undesirable.Examples of side effects include:
    -Modifying global or static variables: A function altering a variable defined outside its scope.
    -Changing database states: A function writing to or deleting data from a database.
    -Accessing the file system: Reading or writing to files.
Making network calls: Functions making HTTP requests to external services.
The "public fields" and "side-effects" mentioned by the author, 
such as the amount field of the Dollar class being public and modifiable by functions, 
serve as examples of side effects. This design is considered bad practice 
because it allows uncontrolled modification of an object's state. 
The author acknowledges such design decisions as temporarily acceptable during the TDD process 
but aims to refactor the code to resolve these problems later.