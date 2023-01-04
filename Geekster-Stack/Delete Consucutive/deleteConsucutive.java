

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int idx = 0; idx < n; idx++){
            String str = scn.next();
            
            if(stk.size() == 0 || str.equals(stk.peek()) == false){
                stk.push(str);
            } else {
                stk.pop();
            }
        }
        
        System.out.println(stk.size());
    }
}