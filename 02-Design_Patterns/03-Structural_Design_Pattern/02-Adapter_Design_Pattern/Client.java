public class Client {
    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketAdapterImpl();

        System.out.println(socketAdapter.get3Volt());
        System.out.println(socketAdapter.get30Volt());
        System.out.println(socketAdapter.get120Volt());
    }
}
