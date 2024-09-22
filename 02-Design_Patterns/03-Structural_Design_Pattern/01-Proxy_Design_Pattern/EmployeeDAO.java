public interface EmployeeDAO {
    void createEmployee(String client, int empID, String empName) throws Exception;
    void deleteEmployee(String client, int empID) throws Exception;
    Employee getEmployee(String client, int empID) throws Exception;
}
