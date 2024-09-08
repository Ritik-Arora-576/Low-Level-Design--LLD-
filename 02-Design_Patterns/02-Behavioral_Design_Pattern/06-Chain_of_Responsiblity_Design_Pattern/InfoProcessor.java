public class InfoProcessor extends LogProcessor {
    public InfoProcessor(LogProcessor nextProcessor){
        super(nextProcessor);
    }

    @Override
    public void log(int logLevel, String message){
        if(logLevel==INFO){
            System.out.println("INFO: "+message);
        } else{
            super.log(logLevel, message);
        }
    }
}
