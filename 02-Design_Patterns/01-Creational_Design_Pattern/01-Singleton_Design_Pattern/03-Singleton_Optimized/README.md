# Lazy Initialization of Singleton Obejct

## Advantages
1. Lazy Initialization which ensures the creation of instance of a Singleton class when it would get called and required within a program.
2. It ensures thread safety when multiple threads executes at a same time. **synchronized(Singleton.class)** command ensures that only one thread will get pass inside the block at time. If one thread completely passed through that code block then only second thread will be allowed to get entered into that code block.