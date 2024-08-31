import java.util.ArrayList;

public class Student implements Cloneable{
    public int roll_no;
    public String name;
    public String father_name;
    public ArrayList<String> subjects;

    public Student(int roll_no, String name, String father_name) throws InterruptedException{
        this.roll_no = roll_no;
        this.name = name;
        this.father_name = father_name;
        this.subjects = fetchSubjects();
    }

    public Student(){}

    private ArrayList<String> fetchSubjects() throws InterruptedException{
        // in order to run this function it will wait for 5 seconds
        Thread.sleep(3000);
        
        ArrayList subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("Science");
        subjects.add("English");

        return subjects;
    }

    @Override
    public String toString() {
        return "Student [roll_no=" + roll_no + ", name=" + name + ", father_name=" + father_name + ", subjects="
                + subjects + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    
}