# Singleton Design Pattern

Singleton Design Pattern is a design pattern which ensures only one instance of class throughout the program which provides global access point to access an object.

* Key Components to design a Singleton Class:

1. **Private Constructor:** To restrict the client for creating the multiple instance of Singleton class.
2. **Private Static member:** It stores the single instance of the Singleton class.
3. **Public Static Method:** It provides the global gateway to access Singleton object. If the instance of singleton object not exists then it will going to create it otherwise returns the existing Singleton object.

## 3 ways to break Singleton pattern

### Way-1: Reflection API

**Reflection API:** Reflection is an API in java which can modify the behavior of class, methods and interfaces at runtime.

We can use **Reflection API** to make private constructor of class accessible at runtime in order to create multiple instances of **Singleton** class.

**Solution-1:** If an object is not null then we would throw **RuntimeException** inside a constructor in order to avoid creating the multiple instances of Singleton Class. It is mentioned in **03-Singleton_Optimized**.

**Solution-2:** Replace Singleton class with **enum**.

### Way-2: Deserialization

**Serialization:** It's a process of converting an object into byte stream or store into a file.
**Deserialization:** It's a reverse process of serialization.

So, we will be going to save an object into a file using **serialization** and then read the file and store it into another class variable using **deserialization** which mutiple instances.

**Solution:** We will going to implement **readObject()** method inside the Singleton class which will return instance.

### Way-3: Clonning

Mutiple instances of Singleton object can be create by using **clone()** as well.

**Solution:** We will going to override the **clone()** method inside the Singleton class which will return instance.