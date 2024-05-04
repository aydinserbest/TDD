No client code knows that there is a subclass called Dollar. 
By decoupling the tests from the existence of the subclasses, 
we have given ourselves freedom to change inheritance without affecting any model code

Hiding Subclasses
When he says, "No client code knows that there is a subclass called Dollar," 
he highlights that the existence of subclasses like Dollar is hidden 
from the client code or the code used by consumers. 
This has been made possible through the use of a factory method (Money.dollar()), 
which employs the general Money type instead of directly using the Dollar class, 
effectively removing its direct usage.

Decoupling Tests from Subclasses
By stating, "By decoupling the tests from the existence of the subclasses, 
we have given ourselves freedom to change inheritance without affecting any model code," 
he discusses how tests have been made independent of the existence of subclasses. 
This decoupling allows changes to be made in the subclasses 
(such as altering inheritance relationships or changing the structure of the subclasses) 
without impacting the model code. 
Thus, structural changes to the system can be made without affecting the existing functionality or tests.

Conclusion
This approach enhances the modularity and extensibility of the software, 
and also simplifies maintenance. 
It allows for quicker and more flexible responses to changes in the system. 
Beck illustrates how such a code structure provides significant advantages 
in software development processes and demonstrates the effectiveness of the TDD approach in such scenarios.