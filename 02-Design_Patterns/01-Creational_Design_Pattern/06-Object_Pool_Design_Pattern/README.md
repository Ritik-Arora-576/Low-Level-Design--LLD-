# Object Pool Design Pattern

Object Pool design pattern is a creational design pattern in which a pool of reusable objects has been mantained in order to reduce the overhead of object creation and destruction.

In this design pattern, a pool (Object Container) of reusable objects has been created and mantained whenever a client required the object then they will borrow it from object pool and return it back to the poll when they are done for reusing it.

This design pattern is useful when creating a new instance is expensive or highly frequent in order to reduce the overhead and cost. Eg: Database Connection, Network connection etc.

### Object Pool Life Cycle

1. **Step-1: Creation** Create the objects and added into the pool.
2. **Step-2: Borrowing** Client will requests and borrow the objects from pool.
3. **Step-3: Usage** Client will use a borrowed object for their task.
4. **Step-4: Returning** After usage, client will return the objects into a pool.
5. **Step-5: Rejection/Removal** If the pool is filled then it will not allow any further objects to be added or remved the object if not in use.

**NOTE:** **DBConnectionPoolManager** class must follow **Singleton** Design pattern in order to ensure only one instance of it and thread safety.