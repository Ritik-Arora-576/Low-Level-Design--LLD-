# Factory Design Pattern

Factory design pattern is a design pattern in which we are creating the objects of sub-classes which implements the same interface by abstracting the creational logic into **Factory Class** on the basis of requirement.

**Example:** There is an interface **Employee** which will be further implemented by classes named **HR**, **Manager** and **Engineer**. We have created separate **EmployeeFactory** class whose resposiblity is to abstract the creational logic and return the object on the basis of requirement.

### Coupling

1. **Tightly Coupled:** In a tightly coupled application, multiple components are dependent upon each other and must be present and function at same time.

2. **Loosly Coupled:** In a loosly coupled application, multiple components function independently with each other.