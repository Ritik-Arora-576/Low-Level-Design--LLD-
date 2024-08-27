public class Singleton{
    // static member
    private static Singleton singleton;

    // private constructor
    private Singleton(){}

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
}