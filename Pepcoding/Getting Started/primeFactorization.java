public class Main
{
	public static void main(String[] args) {
	int n= 1440;
	for(int div =2; div*div<n; div++){
	    
	    while(n % div ==0){
	        
	        n=n/div;
	        System.out.println(div);
	   }
	}
	}
}