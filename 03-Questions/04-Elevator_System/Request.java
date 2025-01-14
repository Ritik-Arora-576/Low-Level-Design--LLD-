public class Request {
    private int src_floor;
    private int dst_floor;

    public Request(int src_floor, int dst_floor){
        this.src_floor = src_floor;
        this.dst_floor = dst_floor;
    }

    public int getSrc_floor() {
        return src_floor;
    }

    public int getDst_floor() {
        return dst_floor;
    }
}
