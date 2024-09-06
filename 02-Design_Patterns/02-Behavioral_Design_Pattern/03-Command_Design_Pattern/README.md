# Command Design Pattern

Command Design Pattern is a behavioral design pattern in which we convert requests into stand-alone objects and queue those requests and provide the abstract methods like **execute()** (which contains the execution logic of that request) and **undo()** (which contains the undo logic of that command which could be reversed) into a **Command** interface.

### Intuition

Let's assume there is a request of turning on a Device and in order to turn on a Device client/user has to follow certain steps in exact squential order. So, in this case it puts up a burden upon client to remember all the squence of processes in order to turn on a Device. 

So, Command Design Pattern provides an abstraction layer which stores all the execution logic to turning on a Device and also an undo logic to reverse/undo that particular request if reversable. In this case, client can execute and undo the following requests by just simply calling those functions without knowing the actual implementation of it.

It decouples the sender (client or invoker) from the receiver (Device) which provides flexibility and extensibility.