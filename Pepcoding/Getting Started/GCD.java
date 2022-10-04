import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();       //24         //36       //24
	    int n2 = sc.nextInt();      //36          //24       //12
	    while(n1 % n2 !=0){         // True        //True    // False
	        int rem = n1 % n2;   //  24%36=24     36%24=12
	        n1=n2;               //   n1=36        //n1=24
	        n2=rem;               //   n2=24        //n2=12
	        
	    }
		System.out.println(n2);                                   //print n2
	}
}