public class Client_2 {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        // creating an object
        Student s1 = new Student(1, "Ritik Arora", "Des Raj Arora");
        System.out.println(s1);

        // creating an another object
        // we will clone the object rather than creating a new object because creating a new object could be time costly
        Student s2 = (Student) s1.clone();
        // then adjust the feilds
        s2.setName("Nitish Yadav");
        s2.setRoll_no(2);
        s2.setFather_name("Ramesh Yadav");
        System.out.println(s2);
    }
}
