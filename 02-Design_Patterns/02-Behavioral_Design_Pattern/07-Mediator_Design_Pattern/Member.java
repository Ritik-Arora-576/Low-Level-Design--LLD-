public interface Member{
    void placeBid(int amount);
    void receiveNotification(Member member, int amount);
    String getName();
}