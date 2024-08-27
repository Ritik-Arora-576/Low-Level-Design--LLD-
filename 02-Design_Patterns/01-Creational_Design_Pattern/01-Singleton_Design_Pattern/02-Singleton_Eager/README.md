# Eager Initialization of Singleton Obejct

## Advantages
It will ensures the thread safety if multiple threads are executing at same time.

## Problem
It will create the instance of singleton class either it will be required in program or not. If we're working over big software systems where there are hundreds of singleton classes then it would make our system slow and memory inefficient.