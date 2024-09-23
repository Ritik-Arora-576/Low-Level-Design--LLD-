public class SocketAdapterImpl extends Socket implements SocketAdapter{
    public Volt get120Volt(){
        return getVolt();
    }

    public Volt get30Volt(){
        Volt volt = getVolt();
        return new Volt(volt.getVolt()/4);
    }

    public Volt get3Volt(){
        Volt volt = getVolt();
        return new Volt(volt.getVolt()/40);
    }
}
