public abstract class LogProcessor{
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    // make an object which stores next handler
    private LogProcessor nextProcessor;

    public LogProcessor(LogProcessor nexProcessor){
        this.nextProcessor = nexProcessor;
    }

    public void log(int logLevel, String message){
        if(nextProcessor!=null){
            nextProcessor.log(logLevel, message);
        }
    }
}