/*print below patttern
	1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	

*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // write ur code here

        int sp=n/2;
        int st = 1;
        int val =1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            int cVal = val;
            for(int j=1; j<=st; j++){
                System.out.print(cVal+"\t");
                if(j<=st/2){
                  cVal++;  
                }else{
                    cVal--;
                }
            
            }
            if(i<=n/2){
                sp--;
                st+=2;
                val++;
            }else{
                sp++;
                st-=2;
                val--;
            }
          
            System.out.println();
        }

    }
}