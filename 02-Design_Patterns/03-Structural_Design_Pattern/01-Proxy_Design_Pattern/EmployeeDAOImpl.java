import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{
    private List<Employee> employees;

    public EmployeeDAOImpl(){
        employees = new ArrayList<>();
    }

    public void createEmployee(String client, int empID, String empName){
        Employee emp = new Employee(empID, empName);
        employees.add(emp);
        System.out.println("Successfully created: "+emp);
    }

    public void deleteEmployee(String client, int empID){
        for(Employee emp: employees){
            if(emp.getId()==empID){
                employees.remove(emp);
                System.out.println("Successfully deleted: "+emp);
                break;
            }
        }
    }

    public Employee getEmployee(String client, int empID){
        for(Employee emp: employees){
            if(emp.getId()==empID){
                System.out.println("Successfully founded: "+emp);
                return emp;
            }
        }
        return null;
    }
}
