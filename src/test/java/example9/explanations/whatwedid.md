Current Stage
At the current stage, the times() method in both the Franc and Dollar classes 
still returns instances of their own classes, 
which can be seen as part of the author's refactoring process. 
This approach is consistent with the step-by-step progression logic of Test-Driven Development (TDD). 
The ultimate goal of the author may be 
to consolidate these classes under a more general Money class or to abstract them, 
but instead of making these changes all at once, the author prefers to proceed slowly and systematically.

Current State and Progress
For now, the times() methods in both the Franc and Dollar classes are 
still returning objects of their own classes:

    Franc Money times(int multiplier) { return new Franc(amount * multiplier); }
    Dollar Money times(int multiplier) { return new Dollar(amount * multiplier); }

These pieces of code, by unifying the method signature to return Money, allow the code to adapt to future changes. However, more steps will need to be taken to achieve a true return type of Money.

Future Steps:
Future steps planned by the author might include moving these methods entirely to the Money class 
and possibly eliminating the Franc and Dollar classes altogether. 
This could be achieved by defining a more general times() method in the Money class, 
allowing more flexible transactions between different currencies. 
At this stage, the presence of classes like Franc and Dollar could gradually be diminished, 
enabling transactions across all currencies through a single times() method.

Conclusion
This gradual transition process prevents the code from breaking 
and allows the author to test the integrity and correctness of the system 
at every step in line with TDD principles. Although the methods might seem incomplete at this moment, 
this gradual shift is one of the initial steps in a larger and more complex refactoring plan. 
The author plans to gradually evolve these classes and methods towards a general Money class, 
which facilitates less risky and more controlled changes to the system.






