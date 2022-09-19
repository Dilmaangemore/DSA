import java.io.*;
import java.util.*;

public class Solution {

    static int reverse(int n){
          
      
        int rev =0;
       for(int i=n; i>0; i=i/10){
           int d = i%10;
           rev = rev * 10 +d;
       }
        return rev;
    }
    static int formNum(){
         
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
          int res =0;
        for(int idx=0; idx<n; idx++){
            int digit = sc.nextInt();
            res = res * 10 + digit;
          
        }
        return res;
    }
    public static void main(String[] args) {
      int n =formNum();
        int rev = reverse(n);
        
          System.out.println(n);
       System.out.print(rev);
        
    }
}