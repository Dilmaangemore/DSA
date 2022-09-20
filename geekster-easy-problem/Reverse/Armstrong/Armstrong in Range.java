import java.io.*;
import java.util.*;

public class Solution {

    static void ArmstrongRange(int a, int b){
      
        for(int i=a; i<=b; i++){
              int sum =0;
            
          int temp =i;
            while(temp >0){
              int digit = temp % 10;
            
            sum = sum + (digit * digit *digit); 
               temp=temp/10;
            }
  
            if(sum == i){
                System.out.println(sum);
              
            }
        
                            
        }
       
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArmstrongRange(a,b);
    }
   
}