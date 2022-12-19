import java.util.ArrayList;

import javax.security.auth.Subject;

public class Student {
    private int rollNo;
    private  String name;
    private Double marks;
    private String gender;

    ArrayList <String> subjects;

    //copy constructor
    /**
     * @param other
     */
    public Student (Student other){
        rollNo=other.rollNo;
        marks= other.marks;
        name=other.name;
        gender=other.gender;
        subjects=new ArrayList<>();
        for(String subject : other.subjects){
            subjects.add(subject);
        }

    }

    public Student(){
        rollNo =1;
        marks=598.4;
        name="Annoy";
        gender="M/F";
        subjects=new ArrayList<>();

    }

      // setter and getter
      public int getRollNo(){
        return rollNo;
      }
    
      public String getName(){
        return name;
      }
    
      public Double getMarks(){
        return marks;
    
      }
    
      public String getGender(){
        return gender;
      }
    // setting
      public void setRollNo(int newRollNo){
        newRollNo=rollNo;
      }
    
      public void setName(String newName){
        newName= name;
      }
    
      public void setMarks(Double newMarks){
        //if(password.equals("1234567"))
        newMarks=marks;
    
      }
    
      public void setGender(String newGender){
        newGender= gender;
      }
}
