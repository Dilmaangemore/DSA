public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n=6;
		printDI(n);
	}
	static void printDI(int n){
	    //base
	    if(n == 0){
	        return;
	    }
	    //pre area
	    if(n%2 != 0){
	      System.out.print("Hi"+n+" ");  
	    }
	    
	    
	    printDI(n-1);
	   //post area
	   if(n%2 == 0){
	     System.out.print("Bye"+n+" ");  
	   }
	    //output : Hi5 Hi3 Hi1 Bye2 Bye4 Bye6
	}
}