public class Volt{
    int volt;

    public Volt(int volt){
        this.volt = volt;
    }

    public int getVolt(){
        return this.volt;
    }

    public void setVolt(int volt){
        this.volt = volt;
    }

    @Override
    public String toString() {
        return "Volt [volt=" + volt + "]";
    }
}