public class Client {
    public static void main(String[] args) {
        try{
            // create proxy object in order to perform operations
            EmployeeDAO employeeDAO = new EmployeeDAOProxy();

            // create employees
            employeeDAO.createEmployee("ADMIN", 1, "Ritik");
            employeeDAO.createEmployee("USER", 2, "Yash");
            employeeDAO.createEmployee("ADMIN", 2, "Yash");

            // find employees
            employeeDAO.getEmployee("ADMIN", 1);
            employeeDAO.getEmployee("ADMIN", 3);
            employeeDAO.getEmployee("USER", 2);

            // delete employee
            employeeDAO.deleteEmployee("ADMIN", 1);
            employeeDAO.deleteEmployee("USER", 2);

        } catch(Exception exception){
            System.out.println(exception);
        }
    }
}
