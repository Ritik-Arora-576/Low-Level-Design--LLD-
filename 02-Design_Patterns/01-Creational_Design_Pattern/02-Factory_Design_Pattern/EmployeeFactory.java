public class EmployeeFactory {
    public static Employee getObject(String str){
        if(str.toLowerCase().equals("manager")) return new Manager();
        else if(str.toLowerCase().equals("hr")) return new HR();
        else if(str.toLowerCase().equals("engineer")) return new Engineer();
        return null;
    }
}
