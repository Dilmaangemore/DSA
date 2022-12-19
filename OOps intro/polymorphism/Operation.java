public class Operation{
    public int sum(int a, int b){
        System.out.println("two integer input");
        return a+b;
    }
    public long sum(long a, long b){
        System.out.println("two long input");
        return a+b;
    }

    public String sum(String a, String b){
        System.out.println("String Concatenation");
        return a+b;
    }

    
    public double sum(double a, double b){
        System.out.println("double/float add");
        return a+b;
    }

    public static void main(String [] args){
        Operation obj= new Operation();
        System.out.println(obj.sum(4, 5));
    }
}