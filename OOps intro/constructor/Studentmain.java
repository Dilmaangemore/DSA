public class Studentmain {
    private static boolean add;

    /**
     * @param main
     */
    public static void main(String [] main){

        Student s1 = new Student();
        s1.setGender("male");
        s1.setMarks(78.2);
        s1.setName("vishnu");
        s1.setRollNo(123445);
        

        System.out.println(s1.subjects);
        s1.subjects.add("java");
        s1.subjects.add("javascript");
        System.out.println(s1.getGender());
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());
        System.out.println(s1.getMarks());


        Student s2 = new Student(s1);
        System.out.println(s2.subjects);

        s1.subjects.add("c++");
        System.out.println(s1.subjects);
        System.out.println(s2.subjects);
    }
}
