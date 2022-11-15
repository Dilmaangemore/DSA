public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n=5;
		print(n);
	}
	static void print(int n){
	    if(n == 0){
	        return;
	    }
	    System.out.print(n+" "); //5 4 3 2 1
	    
	    print(n-1);
	   
	    System.out.print(n+" "); // 1 2 3 4 5
	}
}