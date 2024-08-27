public class Singleton{
    // static member
    private static Singleton singleton;

    // private constructor
    private Singleton(){}

    // public static method: Global Access Point
    public static Singleton getObject(){
        // if the instance of object doesn't exist then we create an instance otherwise we return the existing instance
        if(singleton==null) singleton = new Singleton();
        return singleton;
    }
}