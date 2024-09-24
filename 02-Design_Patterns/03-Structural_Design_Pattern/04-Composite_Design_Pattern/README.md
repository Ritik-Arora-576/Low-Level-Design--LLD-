# Composite Design Pattern

The Composite Design Pattern is a structural design pattern that lets you compose objects into tree-like structures to represent part-whole hierarchies. 
It allows clients to treat individual objects and compositions of objects uniformly. In other words, whether dealing with a single object or a group of objects (composite), clients can use them interchangeably.

In this example, we implemented **File Management System** in which a particular folder contains Files as well as Folders. **ls()** function is use to iterate every element of that Folder. If an object is file then **obj.ls()** would print file name otherwise if it would be a folder then **obj.ls()** would iterate every element in it until it finds leaf node (i.e File).

Designing calculator also forms tree like structure so in this case we would use Composite Design Pattern in order to evaluate an expression.

Eg: 2 + (3 * 5)

Tree Like Structure:                 +
                                    / \
                                   2   *
                                      / \
                                     3   5