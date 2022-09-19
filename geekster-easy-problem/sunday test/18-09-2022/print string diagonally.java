import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int length = str.length();
   
         
        char [] ch = str.toCharArray();
        
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<i; j++){
                
                System.out.print(" ");
            }
            System.out.print(ch[i]);
             System.out.println();
        }
       
    }
}