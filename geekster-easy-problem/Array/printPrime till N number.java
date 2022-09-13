/*
Prime printing 1

Write a Java program to print all Prime numbers between 1 to n.

Input Format

First line contain N.

Constraints

1<=N<=100000

Output Format

Print Prime numbers upto N with space seperation.

Sample Input 0

5
Sample Output 0

2 3 5
*/


import java.io.*;
import java.util.*;

public class Solution {
    
 public static boolean prime(int no){
        if(no<2){
            return false;
}
        else{
            for(int i=2;i<no;i++){
                if(no%i==0){
                    return false;
                }
            }
            return true;
        }
   
}
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
         for(int i=2;i<=n;i++){
                if(prime(i)){
                    System.out.print(i+" ");
                }
            }
  
      
     
    }
}