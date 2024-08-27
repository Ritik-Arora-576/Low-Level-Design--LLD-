import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{
    // static member
    private static Singleton singleton;

    // private constructor
    private Singleton(){
        // Avoid to create multiple instances if constructor would get accessible outside the class via Reflection API
        if(singleton!=null){
            throw new RuntimeException("Object is already created...");
        }
    }

    // public static method: Global Access Point
    public static Singleton getObject(){
        if(singleton==null){
            /* if multiple threads are here at a same time then 
            synchronized condition will allow only one thread at 
            a time which avoid singleton class to have multiple
            instance within a program.*/
            synchronized(Singleton.class){
                if(singleton==null) singleton = new Singleton();
            }
        }
        return singleton;
    }

    // Avoid to create multiple instances via Deserialization
    public Object readObject(){
        return singleton;
    }

    // Avoid to create multiple instances via cloning an instance
    @Override
    public Object clone(){
        return singleton;
    }
}