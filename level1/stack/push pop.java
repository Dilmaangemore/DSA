import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Stack<Integer>st = new Stack<>();
	    st.push(10); 
	    st.push(20);
		System.out.println(st); //    [10, 20]
		st.push(30);
		System.out.println(st); //[10,20,30]
		st.push(40);
		System.out.println(st);  //[10,20,30,40]
		//LIFO 
		//peek method is similar to get element without removing it
		
		System.out.println(st.peek()+"->"+st); //40 -> [10,20,30,40]
		System.out.println(st.size()); //4
		//pop method
		
		st.pop();
		System.out.println(st.peek()+"->" + st.size()); 
		System.out.println(st); //[10,20,30]
		
			st.pop();
		System.out.println(st.peek()+"->" + st.size()); 
		System.out.println(st);
		
			
		
	}
}