public class Employee {
    int id;
    String name;
    float salary;

    // update several Employee details with 
    // by invoking insert method

    void insert(int i, String n, float s){
        // initializing instance varible with give parameter
        id= i;
        name = n;
        salary= s;

    }

    void display(){
        System.out.println(id+ " "+ name +"  earns "+ salary);
    }
}
