public class runEmployee {
    public static void main(String [] args){
        Employee e1= new Employee();
        e1.insert(1234,"Manasa", 42575.345f);
        e1.display();

        Employee e2 = new Employee();
        e2.insert(358, "Vishnu", 1000000.785f);
        e2.display();
        // we can't create e2 again
        Employee e3 = new Employee();
        e3.insert(4568, "Shafi", 145545.45f);
        e3.display();

    }

}
