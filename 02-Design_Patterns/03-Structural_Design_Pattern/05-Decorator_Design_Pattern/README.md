# Decorator Design Pattern

Decorator Design Pattern is a structural design pattern in which we can add new functionalities to an object dyanamically without altering the structure of code.
It is often use to extend the behavior of an object in flexible and resusable way.

In our example, we have **Base Pizza (Marghreta, Farm House and Veggie Delight)** and **Toppings (Extra Cheese, Mushroom and Corns)**. So in order to make our costumized pizza we have to make different classes for different permutations and combinations i.e (MarghretaExtraCheese, FarmHouseCornMushrooms, VeggieDelightExtraCheeseCorn and so on) which leads to **Class Explosion** which makes our code difficult to manage and harder to extend toppings and base pizzas. So, Decorator Design Pattern solves this problem.