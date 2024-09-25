public class EmployeeDAO{
    void add(Employee emp){
        // implement the logic of adding employee to database
        System.out.println("Added to database: "+ emp);
    }

    void findByID(int id){
        // implement the logic of finding employee from database by ID
        System.out.println("Find the employee by ID from database");
    }

    void findByEmp(Employee emp){
        // implement the logic of finding employee from database by employee object
        System.out.println("Find the employee by Object from database: "+emp);
    }

    void updateByID(int id){
        // implement the logic of updating an employee detail from database by ID
        System.out.println("Update the employee by ID from database");
    }

    void updateByEmp(Employee emp, String name){
        // implement the logic of updating employee from database by employee object
        emp.setName(name);
        System.out.println("Update the employee by Object from database: "+emp);
    }

    void deleteByID(int id){
        // implement the logic of deleting an employee detail from database by ID
        System.out.println("Delete the employee by ID from database");
    }

    void deleteByEmp(Employee emp){
        // implement the logic of deleting employee from database by employee object
        System.out.println("Delete the employee by Object from database: "+emp);
    }
}