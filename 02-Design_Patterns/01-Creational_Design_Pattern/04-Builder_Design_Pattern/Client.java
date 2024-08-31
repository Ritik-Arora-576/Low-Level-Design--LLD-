public class Client {
    public static void main(String[] args) {
        // create student object
        Student student1 = StudentBuilder.builder()
                            .setRoll_no(1)
                            .setName("Ritik Arora")
                            .setFather_name("Des Raj Arora")
                            .setMother_name("Neelam Arora")
                            .setStandard(10)
                            .build();

        System.out.println(student1);

        // create another student object
        // while creating an object we can set the values of members without following any specific ordering
        // we can skip to set optional parameter as well in below example we skip to set mother_name
        // we are creating an object in step by step manner
        Student student2 = StudentBuilder.builder()
                            .setRoll_no(2)
                            .setStandard(10)
                            .setFather_name("Ramesh Yadav")
                            .setName("Nitish Yadav")
                            .build();

        System.out.println(student2);
    }
}
