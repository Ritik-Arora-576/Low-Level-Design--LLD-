# Strategy Design Pattern

Strategy Design Pattern is a behavioral design pattern which allows the behavior of an object to be selected at runtime.

This design pattern allows you to create the family of algorithms and encapsulates each of them and make them interchangeable within a code without altering the structure of a code.

It also helps to avoid code redundancy. If there are multiple methods which is implemented in some of the sub-classes which is inherited from the same base class but that method is not present in base class so it would make code redundant. So we would define those methods in an interface and implement those methods in their implemented classes in order to avoid code redundancy.

1. **Context Class:** Context class acts as an interface between **Client** class and **Strategy** class.
2. **Strategy Class:** It's an interface or an abstract class in which all the strategy methods are defined which would be further implemented in **Concrete Strategy** classes like **QuickSort**, **BubbleSort** and **MergeSort**.

In **client.java** the properties of an object has been changed during runtime.