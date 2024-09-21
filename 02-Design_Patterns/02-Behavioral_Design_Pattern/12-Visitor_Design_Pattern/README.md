# Visitor Design Pattern

Visitor Design Pattern is a behavioral design pattern which allows to seperate the algorithms from the objects over which it will going to perform.

In our example, we have three objects **(Single Room, Double Room and Deluxe Room)** over which we runs an algorithms like **(set rent of each rooms, mantainence logic etc.)** so instead of keeping all the algorithmic logic within one class we will define different **concrete visitor classes** which contains seperate algorithms to perform over all the objects **(RoomPricingVisitor: set rent of each room object, RoomMantainenceVisitor: contains mantainence logic)**.

If in the future, we wanted to add more algorithms **(like RoomRentCalculator)** to perform over objects we will define seperate visitor class which contains the calculation logic for each objects without altering the structure of other classes and objects. This design pattern preserves **Open/Closed Principle**.

This design pattern promotes **Horizontal Scaling** instead of **Vertical Scaling** of algorithms.