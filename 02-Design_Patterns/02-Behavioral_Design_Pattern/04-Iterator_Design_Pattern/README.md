# Iterator Design Pattern

Iterator Design Pattern is a behavioral design pattern which provides a way to access the elements from the aggregate object (like Linked List, Array, Hashmap etc.) and traverse that object without knowing the actual representation of it.

In this design pattern, a separate class has been defined named **Iterator** which encapsulates the element accessing logic and traversing logic of aggregate object. And we shouldn't need to know about either an aggregate object is Linked List, Array, Queue, Stack, Hashmap etc.

1. **Iterator:** It's an interface whose methods would be implemented by **concrete Iterator** which is **BookIterator** class for this example. In this interface there are two methods, first is **hasNext()** which return true if we doesn't fully traverse concrete aggregate object otherwise false. And second is **next()** method which return the current element and increase the value of index by 1.

2. **Aggregate Interface:** It's an interface whose methods would be implemented by **concrete aggregate classes** which is **Library** class for this example. In this interface, **createIterator()** is defined which is used to create Iterator object to access the elements of concrete Aggregate class and traverse that object.