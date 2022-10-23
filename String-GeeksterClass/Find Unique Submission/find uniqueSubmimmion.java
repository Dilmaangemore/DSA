

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        boolean [] freq = new boolean[10];
            
            for(int i=0; i<str.length(); i++){
              freq[str.charAt(i)-'0']=true;
            }
        int count =0;
        for(int i=0; i<10; i++){

            if(freq[i] == true) count++;
            
        }
        System.out.println(count);
    }
}