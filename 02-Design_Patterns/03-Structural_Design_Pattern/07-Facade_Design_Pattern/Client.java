public class Client {
    public static void main(String[] args) {
        EmployeeDAOFacade employeeDAOFacade = new EmployeeDAOFacade(new EmployeeDAO());

        // adding into database
        employeeDAOFacade.add(new Employee(1, "Ritik", "IT"));
        employeeDAOFacade.add(new Employee(2, "Yash", "Management"));
        employeeDAOFacade.add(new Employee(3, "Arnab", "HR"));

        // finding employee by ID
        employeeDAOFacade.findByID(1);

        // delete employee by ID
        employeeDAOFacade.deleteByID(1);
    }
}
