public class Client {
    public static void main(String[] args) {
        // this object contains series of handlers
        LogProcessor logProcessor = new InfoProcessor(new DebugProcessor(new ErrorProcessor(null)));

        logProcessor.log(LogProcessor.DEBUG, "This code needs to be debug.");
        logProcessor.log(LogProcessor.INFO, "This code is all good.");
        logProcessor.log(LogProcessor.ERROR, "This code gets an error.");
    }
}
