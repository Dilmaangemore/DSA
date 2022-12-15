public class student {
    int rollNo;
    String name;
    Double marks;
    String gender;

    
    public void study(){
        System.out.println("student is stydying");
    }
    
    public void play(String sports){
        System.out.println("Studen is playing"+sports);

    }

    public boolean getResult(){
        if(marks>=35.00){
            return true;
        }
        return false;
    }

    public void setRollNo(int newRollNo){
        rollNo=newRollNo;
        
    }


}
