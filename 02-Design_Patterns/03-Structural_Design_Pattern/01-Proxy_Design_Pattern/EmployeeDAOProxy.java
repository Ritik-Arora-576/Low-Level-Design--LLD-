public class EmployeeDAOProxy implements EmployeeDAO{
    private EmployeeDAO employeeDAO;

    // constructor injection
    public EmployeeDAOProxy(){
        this.employeeDAO = new EmployeeDAOImpl();
    }

    public void createEmployee(String client, int empID, String empName) throws Exception{
        if(client.equals("ADMIN")){
            employeeDAO.createEmployee(client, empID, empName);
        }
        throw new Exception("Client is not authorized to create employee.");
    }

    public void deleteEmployee(String client, int empID) throws Exception{
        if(client.equals("ADMIN")){
            employeeDAO.deleteEmployee(client, empID);
        }
        throw new Exception("Client is not authorized to delete employee.");
    }

    public Employee getEmployee(String client, int empID) throws Exception{
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeDAO.getEmployee(client, empID);
        }
        throw new Exception("Client is not authorized to fetch employee.");
    }
}
