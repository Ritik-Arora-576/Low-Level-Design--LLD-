public class Student{

    // creating private members
    private int roll_no;
    private String name;
    private String father_name;
    private String mother_name;
    private int standard;
    
    // constructor
    // instead of passing parameters directly from client we'll pass the object of builder class
    Student(StudentBuilder studentBuilder){
        this.roll_no = studentBuilder.roll_no;
        this.name = studentBuilder.name;
        this.father_name = studentBuilder.father_name;
        this.mother_name = studentBuilder.mother_name;
        this.standard = studentBuilder.standard;
    }

    // getter methods
    // we would not create setter in order to make members immutable
	public int getRoll_no() {
		return roll_no;
	}

	public String getName() {
		return name;
	}

	public String getFather_name() {
		return father_name;
	}

	public String getMother_name() {
		return mother_name;
	}

	public int getStandard() {
		return standard;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", father_name=" + father_name + ", mother_name="
				+ mother_name + ", standard=" + standard + "]";
	}
}