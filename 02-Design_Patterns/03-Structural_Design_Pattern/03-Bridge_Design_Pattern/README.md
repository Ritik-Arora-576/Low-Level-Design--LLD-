# Bridge Design Pattern

Bridge Design Pattern is a structural design pattern which seperates the abstraction from its implementation.

* It consists of two interfaces/abstract classes:
1. **Implementer:** Which contains implementation logic.
2. **Abstraction:** Classes whose instance will access the implementation logic.

In this design pattern, both **Implementer** and **Abstraction** would grow independently without altering the behavior of each other. Client would access **Abstraction** class without knowing the details of **Implementer** class which make them **loosly coupled**.

### UML
![UML of Bridge Design Pattern](https://media.geeksforgeeks.org/wp-content/uploads/Bridge_Design.png)

UML of Bridge Design Pattern can look similar like Strategy Design Pattern but Strategy Design Pattern focuses over changing the behavior of object during runtime while Bridge Design Pattern focuses upon the decoupling of abstraction from its implementation to make them independent.

### Example

* **Strategy Design Pattern:** A payment system where different payment methods (PayPal, CreditCard) are strategies that can be executed and select dynamically while doing payment.

* **Bridge Design Pattern:** A drawing API where shape abstraction(eg. Circle, Square) can be drawn with different implementations(VectorRender, ResterRender) without changing the abstraction.