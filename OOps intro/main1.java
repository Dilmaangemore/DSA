public class main1 {
    public static void main(String [] args){
     // instance of class
        student s1 = new student(); 
        // updation of data 

     s1.marks=75.00;
     s1.gender="M";
     s1.rollNo=10;
     s1.name="vishnu";

     s1.study();
     s1.play("cricket");
     boolean res = s1.getResult();
     System.out.println(res);

     //setting roll No

     s1.setRollNo(75);
     System.out.println(s1.rollNo);
    }
}
