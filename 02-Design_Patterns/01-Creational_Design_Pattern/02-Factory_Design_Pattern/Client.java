public class Client {
    public static void main(String[] args) {
        // creating an object of manager
        Employee e1 = EmployeeFactory.getObject("manager");
        System.out.println(e1.getSalary());

        // creating an object of hr
        Employee e2 = EmployeeFactory.getObject("hr");
        System.out.println(e2.getSalary());

        // creating an object of engineer
        Employee e3 = EmployeeFactory.getObject("engineer");
        System.out.println(e3.getSalary());
    }
}
