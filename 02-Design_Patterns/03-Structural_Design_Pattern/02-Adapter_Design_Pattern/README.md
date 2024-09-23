# Adapter Design Pattern

Adapter Design Pattern is a structural design pattern which makes two objects from different incompatible interfaces to work together.
There is a class Adapter which is responsible for joining the functionality of two independent and incompatible interfaces.

### Real life example:

1. If you wanted to charge your phone from socket, so you can't directly extact the electricity from socket and transfer it to your phone. You need **charger (Adapter)** in order to make your phone charge. So, socket and phone incompatible with each other but charger acts as an Adapter in order to make them work together.

2. Assume there is one class which generates request in CSV format and you pass your request to a server which accepts the request in JSON format. So these two objects are showing incompatible behavior with each other. So, we need a **Parser (Adapter)** in order to convert data from CSV format to JSON format so that those two objects works together collaborately.