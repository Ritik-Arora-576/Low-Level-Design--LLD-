# Template Method Design Pattern

Template Method Design Pattern is a behavioral design pattern in which you wanted squence of algorithms to be executed in a fixed manner but define thier logic in sub-classes in order to acheive flexiblity and extensiblity.

### Example

In our example, we can do Payment either to our friends or merchands. In order to make payment successful they have to follow certain steps in a fixed squential order **(i.e intiatePayment() -> debitPayment() -> deductPlatformFees() -> creditPayment())** but the logic of each step can be differ. For eg: in method **deductPlatformFees()** for **PaymentToFriend** class there would be no platform fee but for **PaymentToMerchand** a platform fee could be 2% of total payment. So, in abstract class we would make a **final** method **i.e makePayment()** which fix the ordering of algorithms in which they'll going to execute but logic would be define in respective sub-classes.