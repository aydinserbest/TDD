&& getClass().equals(money.getClass()); 

Using classes this way in model code is a bit smelly. 
We would like to use a criterion that makes sense in the domain of finance, 
not in the domain of Java objects. 
But we don’t currently have anything like a currency, 
and this doesn’t seem to be sufficient reason to introduce one, so this will have to do for the moment.


The author expresses concern about using classes this way in model code, 
describing it as "a bit smelly." 
In software development, the term "smelly" is often used to describe parts of the code 
that are not ideal in design or might lead to issues in the future. 
The author prefers to use a criterion that makes sense in the financial domain, 
rather than relying on the domain of Java objects.

In this case, the author points out that relying on getClass().equals(money.getClass()) to check if objects are of the same type is not ideal. In financial systems, currencies are typically represented by more meaningful identifiers, such as ISO codes (e.g., "USD" for U.S. dollars, "EUR" for euros). These identifiers are based on real-world definitions of currencies, rather than the class of the objects.

Ideally, the author would prefer to use a separate field (such as a currency property) for the currency. 
This field would specify the currency of each Money object 
and could be compared in the equals() method. 
However, as the author mentions, since such a structure does not currently exist, 
class comparison is used as a temporary solution.

Example Explanation
Suppose our Money class is structured like this:

    public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object) {
        if (object instanceof Money) {
            Money money = (Money) object;
            return this.amount == money.amount && this.currency.equals(money.currency);
        }
        return false;
    }
    }
In this structure, 
instead of creating separate classes for each currency, 
we manage currencies through the currency variable. 
This approach better reflects the realities of the financial domain and is more sensible 
than using getClass(). In the equals() method, currencies (currency) are now compared. 
This provides an approach that makes sense in the financial domain 
and is independent of Java's object modeling, 
aligning with what the author desires for a more domain-relevant solution.

