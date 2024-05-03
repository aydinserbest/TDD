1-
The author prefers the statement assertEquals(five, product); 
over assertEquals(10, product.amount); to make the tests more "speaking," i.e., 
more meaningful and explanatory. The primary reason for this approach is that 
instead of merely comparing numbers, the tests should check the behaviors 
and equality of objects in line with the nature of object-oriented programming. 
The aim is to enhance the readability and understandability of the code by adhering 
to object-oriented programming paradigms.

Object Comparison and "Speaking" Tests

Depth of Meaning: 
Statements like assertEquals(new Dollar(10), product); 
better articulate what the test is trying to verify. Such a test confirms that 
the Dollar class's equals method works correctly and that the times method produces 
the expected new Dollar object. 
This provides much more information than merely checking a numerical value 
with assertEquals(10, product.amount);.

Comprehensive Validation: 
Directly comparing numerical values (assertEquals(10, product.amount);) 
shows that the test only checks the value of one property 
and ignores how that property interacts with other properties or methods of the object. 
Object comparisons verify that the Dollar class behaves exactly as expected 
and functions correctly in all aspects.

Expressive Power of Code: 
"Speaking" tests ensure that the test code itself offers clear statements 
about how the software should function. The tests explicitly inform about a specific functionality, 
which not only makes code maintenance easier but also assists new developers or others who review the code.

Consequently, object-based comparisons with statements like assertEquals(new Dollar(10), product); 
extend beyond merely making technical verifications to accurately reflecting the business logic 
and design of the software. 

These types of tests "speak" about the expected behaviors of the software, 
making the tests more meaningful as part of the software development process.

2)
The author finds assertEquals(five, product); to be more "speaking" or expressive 
than assertEquals(10, product.amount); because this approach more meaningfully 
and clearly communicates what the tests are verifying.

Why is Object Comparison More Meaningful?

Object-oriented approach: 
The statement assertEquals(new Dollar(10), product); compares the values of objects. 
This aligns more closely with one of the fundamental principles of object-oriented programming—encapsulation. 
Instead of directly accessing and checking the internal state (the amount value) 
from outside (product.amount), we evaluate the object as a whole. 
This makes the tests 
more resilient against changes in the object's internal structure.
Use of equality definition: Overriding the equals method allows setting criteria 
for equality among Dollar objects. 
This way, the equality between objects is defined based on the amount value, 
and assertEquals checks this definition to determine if two Dollar objects are equal. 
This clarifies what the test is checking.
Enrichment of meaning and purpose of the test: 
The statement assertEquals(new Dollar(10), product); 
indicates that the test is verifying not just numbers, but that two Dollar objects should be equal in value. 
This approach makes the test more readable and understandable. 
It also guides those maintaining the code on how the Dollar class should be used.
As mentioned above, having "speaking" tests means that the tests clearly communicate 
to the reader what the test is checking and what the expected outcomes are. 
Using object comparison makes the tests more "talkative" because it checks the equality of objects, 
thereby writing a test that is more aligned with the object-oriented programming paradigm 
and more clearly conveys the purpose of the tests.

###

In this context, the term "speaking" is used to emphasize that 
tests should be more explanatory and meaningful. 
Here, "speaking" means 
that the tests express themselves more clearly, that is, 
the written test code communicates to the reader what the test is testing 
and what the expected results are in a clearer language. 
This indicates that tests should not only perform technical checks 
but also "speak" more clearly about the operation and rules of the software.
For example, using assertEquals in tests to compare not just numbers 
but to verify the equality of Dollar objects using the equals method 
makes the tests express the expected behaviors in a more meaningful way. 
Thus, the tests better reflect the design and operational logic of the software 
and more effectively convey the purpose of the test to those reading the code.