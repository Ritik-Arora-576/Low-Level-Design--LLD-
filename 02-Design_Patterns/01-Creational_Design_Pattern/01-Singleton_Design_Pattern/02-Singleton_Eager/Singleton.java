public class Singleton{
    // static member: Eager Initialization
    private static Singleton singleton = new Singleton();

    // private constructor
    private Singleton(){}

    // public static method: Global Access Point
    public static Singleton getObject(){
        return singleton;
    }
}