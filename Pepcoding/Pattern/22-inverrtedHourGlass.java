/*
*	*	*	*	*	*	*	*	*	
	*	*	*	*	*	*	*	
		*	*	*	*	*	
			*	*	*	
				*	
			*		*	
		*				*	
	*						*	
*	*	*	*	*	*	*	*	*
*/

import java.io.*;
import java.util.*;

public class 22-inverrtedHourGlass {

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int sp=0;
        int st =n;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=sp; j++)
         {
          System.out.print("\t");
          
     
         }
         for(int j=1; j<=st; j++){
            if(i<n && i>n/2 && j>1 && j<st){
                System.out.print("\t");
            }else{
                System.out.print("*\t");
            }
         }
         if(i <=n/2){
             sp++;
             st-=2;

         }else{
             sp--;
             st+=2;
         }
         System.out.println();

    } 
        
 }

}