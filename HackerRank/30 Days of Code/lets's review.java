/*Sample Input:
2
Hacker
Rank


Sample Output:

Hce akr
Rn ak
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t>0){
           String str = sc.next();
       
          
           String s1 ="";
           String s2 ="";
           for(int j=0; j<str.length(); j++){
               if(j%2==0){
                   s1+= str.charAt(j);
                   
               }else if(j%2 !=0){
                   s2+=str.charAt(j);
               }
           }
           System.out.print(s1+" "+s2);
           t--;
           System.out.println();
       }
       
       
    }
    
}