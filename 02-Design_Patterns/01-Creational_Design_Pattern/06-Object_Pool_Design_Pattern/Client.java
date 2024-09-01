public class Client {
    public static void main(String[] args) {
        // getting a singleton instance
        DBConnectionPoolManager dbConnectionPoolManager = DBConnectionPoolManager.getInstance();

        // creating new DB connections
        DBConnection connection1 = dbConnectionPoolManager.getDbConnection();
        DBConnection connection2 = dbConnectionPoolManager.getDbConnection();
        DBConnection connection3 = dbConnectionPoolManager.getDbConnection();
        DBConnection connection4 = dbConnectionPoolManager.getDbConnection();
        DBConnection connection5 = dbConnectionPoolManager.getDbConnection();
        DBConnection connection6 = dbConnectionPoolManager.getDbConnection();
        DBConnection connection7 = dbConnectionPoolManager.getDbConnection();
        
        // released DB connections
        dbConnectionPoolManager.releaseDBConnection(connection5);
    }
}
