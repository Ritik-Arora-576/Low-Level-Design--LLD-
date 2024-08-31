# Prototype Design Pattern

Prototype Design Pattern is a creational design pattern in which we create the copies of existing instance of class rather than creating a new instances of class because creating a new instance of object could be costly. It also helps to hide the complexity of creating a new instance of class from client.

Existing instance of class is known as **Prototype**.

In **Client_1** class we're creating the two new instances of class. Although creating a new instance of class is time costly method as **fetchSubjects()** method took 3 seconds in order to execute. So, in **Client_2** class we have created a one instance of class which is **Prototype** and clone it into second object without creating a new new instance of it which would save cost.

### Shallow Copy vs Deep Copy

* **Shallow Copy:** It is used to copy the reference address of an object rather than their values that's why if an **obj2** is a shallow copy of **obj1** then if we change any attributes in **obj1** then same changes gets reflect in **obj2**. Shallow copy is faster.

* **Deep Copy:** It is used to copy the value of objects so if an **obj2** is a deep copy of **obj1** then if we change any attributes in **obj1** then none of the changes gets reflect in **obj2**. Deep copy is slower.