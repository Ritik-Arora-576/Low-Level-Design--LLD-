# Lazy Initialization of Singleton Obejct

## Advantages
Instance of singleton class will create if and only if it's get called in program and required otherwise not which makes the system much more faster.

## Problem
In the case of multithreading, if multiple threads executes at the same time then if multiple threads meets the condition **if(singleton==null)** at a same time then it would leads to create multiple instance of Singleton class which breaks the design pattern and **thread safety**.