# Singleton Design Pattern

Singleton Design Pattern is a design pattern which ensures only one instance of class throughout the program which provides global access point to access an object.

* Key Components to design a Singleton Class:

1. **Private Constructor:** To restrict the client for creating the multiple instance of Singleton class.
2. **Static member:** It stores the single instance of the Singleton class.
3. **Static Method:** It provides the global gateway to access Singleton object. If the instance of singleton object not exists then it will going to create it otherwise returns the existing Singleton object.