import java.io.*;
import java.util.*;

public class Solution {

   public  static boolean ArmstrongNum(int n){
        int power =0;
        int originalN= n;
        while(n>0){
           
            int digit = n%10;
            //System.out.println(digit);
            int cube = digit * digit * digit;
            power = power + cube;
           // System.out.println(power);
          n=n/10;
        }
      if(power == originalN){
          return true;
      }
        return false;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ArmstrongNum(n));
    }
   // boolean res = ArmstrongNum(n);
   
}