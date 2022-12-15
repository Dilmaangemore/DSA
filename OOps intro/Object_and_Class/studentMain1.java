public class studentMain1 {
    public static void main(String [] args) {

        student1  s1= new student1();
        s1.gender='F';
        s1.marks=34.32;
        s1.rollNo=1140710332;
        s1.name="manasa Balla";

        System.out.println(s1.name+" "+ s1.rollNo);

        s1.study();
        s1.getResult();
        s1.setRollNo(12373772);


        student1 s2 = new student1();
        s2.gender='M';
        s2.name="Vishnu";
        s2.marks=89.99;
        s2.rollNo=140710358;
        System.out.print(s2.name+" "+ s2.rollNo);
       s2.play("cricket");




        
        

    }
}
/*output :
manasa Balla 1140710332
Student is Studying
Vishnu 140710358Student is Playingcricket */