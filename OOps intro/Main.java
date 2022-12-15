import java.util.jar.Attributes.Name;

public class Main {
   public static void fun(student s){
    s.marks=100.00;
    System.out.print(s.marks); //100.00
    s.marks=99.00;
    


   }

    /**
     * @param args
     */
    public static void main(String [] args){
      student s1= new student();

      s1.name = "Vishnu";
      s1.gender="Male";
      s1.rollNo=123454;
      s1.marks = 95.28;

        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.gender);
        System.out.println(s1.marks);

        fun(s1);

        student s2 = new student();

        s2.name="Annanya";
        s2.gender="female";
        s2.rollNo =852566;
        s2.marks = 85.2566;

        
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.gender);
        System.out.println(s2.marks);

        student[] arr = new student[3];

        arr[0] = s1;
        arr[1] = s2;

        arr[2] = new student();
        arr[2].name = "Chetan";
        arr[2].rollNo = 3;
        arr[2].gender = "Male";
        arr[2].marks = 95.00;

        System.out.println(arr[2].name);
        System.out.println(arr[2].rollNo);
        System.out.println(arr[2].gender);
        System.out.println(arr[2].marks);
    }

}
