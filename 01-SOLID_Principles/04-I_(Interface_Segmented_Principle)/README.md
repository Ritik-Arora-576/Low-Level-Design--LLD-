# Interface Segmented Principle

This principle states that interface should be design in such a manner that client should not implement unneccesary methods.

In **Example-1** we design an interface **RestaurentEmployee** which has three abstract methods **washDishes()**, **serveCostumers()** and **cookFood()**. And there is one class **Waiter** which implements the methods of interface **RestaurentEmployee**. So, the responsiblity of **Waiter** class is to implement **serveCostumers()** method only while there are two more methods **washDishes()** and **cookFood()** which are unnecessary methods for Waiter to implement which violates Interface Segmented Principle.

In **Example-2** we solve this issue by segmented the interface into two **WaiterInterface** whose responsiblity is to **serveCostumers()** and **ChefInterface** whose responsiblity is to **cookFood()** and **washDishes()**. So, it follows this principle as it's not implementing unecessary methods.