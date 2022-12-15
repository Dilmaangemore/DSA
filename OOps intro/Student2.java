public class Student2 {

    private int rollNo;
    private  String name;
    private Double marks;
    private String gender;

    
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
