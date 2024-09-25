public class EmployeeDAOFacade {
    private EmployeeDAO employeeDAO;

    public EmployeeDAOFacade(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    void add(Employee emp){
        employeeDAO.add(emp);
    }

    void findByID(int id){
        employeeDAO.findByID(id);
    }

    void findByEmp(Employee emp){
        employeeDAO.findByEmp(emp);
    }

    void updateByID(int id){
        employeeDAO.updateByID(id);
    }

    void updateByEmp(Employee emp, String name){
        employeeDAO.updateByEmp(emp, name);
    }

    void deleteByID(int id){
        employeeDAO.updateByID(id);
    }

    void deleteByEmp(Employee emp){
        employeeDAO.deleteByEmp(emp);
    }
}
