# Proxy Design Pattern

Proxy Design Pattern is a structural design pattern which provides extra layers in order to control the access of an object.

### Use cases:
1. It is use for authentication. If client is authenticate then Proxy class allows to pass the request to a next step in order to access an object.
2. It is also use for pre-processing and post-processing.
3. It is also use for caching.

![Proxy Flow Diagram](https://media.geeksforgeeks.org/wp-content/uploads/20240202170221/changing-of-proxies.webp)

In our example, there is an interface **EmployeeDAO** which has create, delete and get method. There is a concrete class **EmployeeDAOImpl** which implements the **createEmployee**, **deleteEmployee** and **getEmployee** methods. Rather than directly access these methods initialy request will pass to **EmployeeDAOProxy** class, if client is authenticate then it will gives the access of those method in order to enhance database security.