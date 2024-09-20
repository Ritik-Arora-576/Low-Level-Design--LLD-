# Momento Design Pattern

Momento Design Pattern is a behavioral design pattern which allows an object to capture its current state and restore back to their previous states without violating encapsulation.

This design pattern is used to implement undo feature in applications like text editor, MS word, MS Paint etc.

### Key Components

* **Originator:** It is an object whose internal state would get store.
* **Momento:** It is used to capture the current state of Originator. It should be private in order to restrict the external access.
* **Caretaker:** It is used to store the track of Momentos in stack which is used to store the current state and restore back to its previos states.