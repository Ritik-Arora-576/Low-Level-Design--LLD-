# Builder Design Pattern
Builder Design Pattern is a creational design pattern in which we create complex and heavy objects step by step by defining setters into **Builder** class in order to set the parameters.

### Challenges
While creating a complex object which contains too many arguements will arise certain problems:

1. If we pass too many arguements to constructor (like 100s) then client have to remember the ordering of arguements in which we have to pass the arguement which is complicated.

2. If there are certain optional feilds inside a class so we have to overload the constructor in order to skip the parameters.

3. In **Factory Design Pattern**, factory class took all the responsiblity to create objects. If the object is heavy then it will increase the overall complexity of factory class.

### Disadvantage
It will create code redundancy between **Student class** and **Student Builder Class**.

### NOTE
1. In **Builder Design Pattern**, we keep members immutable in order to ensure thread safety.
2. In **Student** class we only keep getters and keep members private in order to acheive immutablity.
3. In **StudentBuilder** class we keep setters method in order to set the values of members.
4. In **StudentBuilder** class we create **build()** method in order to build the object of **Student** class.
5. In **Client** class we have create two objects of Student in which we doesn't follow any specific ordering to create an object and we could also skip to set the parameter as we did with object **student2** where we skip to pass the parameter value for **mother_name**.