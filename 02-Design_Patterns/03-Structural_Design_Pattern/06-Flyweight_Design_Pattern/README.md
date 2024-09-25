# Flyweight Design Pattern

The Flyweight design pattern is a structural pattern that focuses on optimizing memory usage by sharing a common state among multiple objects. It aims to reduce the number of objects created and to decrease memory footprint, particularly useful when dealing with a large number of similar objects.

In our example, Robot has four properties which are type, Sprites, x-coordinate and y-coordinate and we have a method display which displays robot object at given coordinate point.

**Memory Consumption Breakdown**
1. Type: 10B
2. Sprite: 10KB
3. X Coordinate: 4B
4. Y Coordinate: 4B
5. Total Memory Consumption: 11KB (Approx for each object)

* **Without Flyweight:** We're building 500K objects of Humanoids and 500K objects of Robodogs. In total there are 1 Million objects which has been created and each time we're creating an object by passing each properties. Objects of similar types like Humanoids shares similar type of properties which are type and sprite but differ in X and Y coordinates and similar with Robodogs. But each time we're creating new instance of every properties either it is shared information or not.
Total Memory Consumption: 11KB * 1M = 11GB

* **Without Flyweight:** If we create only one instance of **Intrinsic Properties (i.e type and shape)** and share among multiple objects of similar type by providing **Extrinsic Properties (i.e X-coordinates and Y-coordinates)** by user end then it would optimized the memory consumption.
Total Memory Cosnumption: 10KB + (4B*1M) = 4.1MB

Percentage of memory saved: 99.99% (Approx)