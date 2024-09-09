# Mediator Design Pattern

Mediator Design Pattern is a behavioral design pattern in which there is a centralized Mediator objects which facitilates the communication among other components/objects of a system.

This promotes loosly coupled behavior among the objects by avoiding them to directly communicates with each other which results into better code mantainablity, code flexiblity, extensiblity and lower mantainence cost.

In this example, we have designed **Online Auction System** in which **AuctionMediator** acts as a **Mediator** object and **Bider** objects communicate with Mediator object in order to place a bid amount and Mediator object sends notifications to other **Bider** objects about the status of biding. 