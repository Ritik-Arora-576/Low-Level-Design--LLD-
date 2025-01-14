# Design Elevator System

### Requirements:

1. How many floors.
2. How many elevators.
3. Find optimal elevator Logic (Use Strategy Design Pattern)
4. Capacity of each lift

### Objects:

1. Elevator
2. Elevator Controller
3. Elevator System
4. Request 
5. FindOptimalElevatorStrategy (Strategy Design Pattern)
6. Direction (Enum -> UP, DOWN)
7. State (Enum -> MOVE, IDLE)

### Elevator
1. int id
2. int capacity
3. Direction Direction
4. State state 
5. List(Request) requests
6. int curr_floor
7. synchronized addRequest(Request request)
8. synchronized processRequests()
9. synchronized processRequest(Request request)

### Elevator Controller
1. List(Elevator) elevators
2. FindOptimalElevatorStrategy obj
3. requestElevator(int src_floor, int dst_floor)
4. getOptimalElevator(Request request)

### FindOptimalElevatorStrategy
1. Even/odd
2. Most closest
3. getElevator(List(Elevator) elevators)

### Request
1. int src_floor
2. int dest_floor
3. getSrcFloor()
4. getDstFloor()