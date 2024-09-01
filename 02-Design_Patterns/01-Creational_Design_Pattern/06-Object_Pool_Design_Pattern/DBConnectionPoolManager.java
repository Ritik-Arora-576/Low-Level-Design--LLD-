import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    private List<DBConnection> freeResources = new ArrayList<>();
    private List<DBConnection> inUseResources = new ArrayList<>();
    private int INITIAL_POOL_SIZE = 3;
    private int MAX_POOL_SIZE = 6;
    private static DBConnectionPoolManager instance;

    private DBConnectionPoolManager(){
        for(int i=0;i<INITIAL_POOL_SIZE;i++) freeResources.add(new DBConnection());
    }

    // global access point for singleton instance
    public static DBConnectionPoolManager getInstance(){
        if(instance==null){
            // thread safety
            synchronized(DBConnectionPoolManager.class){
                if(instance==null){
                    instance = new DBConnectionPoolManager();
                }
            }
        }
        return instance;
    }

    // to ensure thread safety
    public synchronized DBConnection getDbConnection(){
        if(freeResources.isEmpty() && inUseResources.size()<MAX_POOL_SIZE){
            System.out.println("New DB connection created.");
            DBConnection dbConnection = new DBConnection();
            inUseResources.add(dbConnection);
            return dbConnection;
        }

        else if(freeResources.isEmpty() && inUseResources.size()>=MAX_POOL_SIZE){
            System.out.println("Pool Size is Maximum");
            return null;
        }

        System.out.println("New DB connection created.");
        DBConnection dbConnection = freeResources.remove(freeResources.size()-1);
        inUseResources.add(dbConnection);
        return dbConnection;
    }

    // to ensure thread safety
    public synchronized void releaseDBConnection(DBConnection dbConnection){
        if(dbConnection!=null){
            inUseResources.remove(dbConnection);
            freeResources.add(dbConnection);
            System.out.println("DB Connection released.");
        }
    }
}