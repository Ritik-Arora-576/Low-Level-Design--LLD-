public class StudentBuilder {
    // creating public members as same as in Student class
    public int roll_no;
    public String name;
    public String father_name;
    public String mother_name;
    public int standard;

    // constructor
    public StudentBuilder(){}

    // create builder method in order to build new object of Student Builder
    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    // set feild via setter methods
	public StudentBuilder setRoll_no(int roll_no) {
		this.roll_no = roll_no;
        return this;
	}

	public StudentBuilder setName(String name) {
		this.name = name;
        return this;
	}

	public StudentBuilder setFather_name(String father_name) {
		this.father_name = father_name;
        return this;
	}

	public StudentBuilder setMother_name(String mother_name) {
		this.mother_name = mother_name;
        return this;
	}

	public StudentBuilder setStandard(int standard) {
		this.standard = standard;
        return this;
	}

    // build method to create an object
    public Student build(){
        return new Student(this);
    }
}
