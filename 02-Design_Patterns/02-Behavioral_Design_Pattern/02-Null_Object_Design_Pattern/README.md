# Null Object Design Pattern

Null Object Design Pattern is a behavioral design pattern which provides a way to handle **null** objects or **non-existing** objects.
It is used to avoid explicit NULL checks and provides the default behavior of objects which may not exist which reduces code redundancy and increase code manageablity.

### Example

In a given example there is **Vehicle** interface whose methods are implemented by **Car** and **Bike** class. There is also a method in **Client.java** named **printVehicle(Vehicle vehicle)** which prints vehicle detail. Incase vehicle object is NULL or doesn't exists then it would throw NULL pointer exception which would be handled by a condition **"if(vehicle!=null)"** explicitly.

But assume if you're working over big project in which you have to define NULL checks at 100s of places then a code would get redundant and quite difficult to manage. So, in order to remove NULL checks we would define an extra class **NULLVehicle** which would handle automatically if object is NULL or doesn't exists without defining NULL checks. And it will set some default behavior for them.