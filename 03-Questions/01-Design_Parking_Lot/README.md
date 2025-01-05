# Parking Lot System

### Rough Flow

**Vehicle -> Entry (Collects Ticket) -> Park Vehicle -> Exit (Payment)**

Vehicle enters through an entrance gate collects the ticket and park the vehicle at parking spot then after certain time driver unpark the vehicle and takes an exit by paying the parking amount.

### Requirement Clarification
1. Parking Spot should be nearest
2. How many entrances and exits
3. How many parking lot levels
4. Different types of vehicles and parking spots
5. Different types of payment methods

### Objects
1. Vehicle
2. Ticket
3. Entrance Gate
4. Parking Spot
5. Exit Gate
6. Payment

### 1. Vehicle

Data Members:
1. Vehicle Number
2. Vehicle Type (Enum)

### 2. Vehicle Type (Enum)
It contains two types of vehicle which are Two-wheeler, Four-wheeler. (Scalable)

### 3. Ticket

Data Members:
1. Entrance Time
2. Parking Spot (Class)
3. Vehicle (Class)

### 4. Entrance Gate:

Methods:
1. Find Parking Spot
2. Update Parking Spot
3. Generate Ticket

### 5. Parking Spot

Data Members:
1. id
2. Vehicle
3. Vehicle Type
4. Price

Methods:
1. isEmpty

### 6. Exit Gate

Data Members:
1. Exit Time

Methods:
1. Cost Calculation
2. Do Payment