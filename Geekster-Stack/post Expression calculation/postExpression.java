import java.io.*;
import java.util.*;

public class Solution {
    public static int evaluatePostfix(String str){
        Stack<Integer> stk = new Stack<>();
        
        for(int idx = 0; idx < str.length(); idx++){
            char ch = str.charAt(idx);
            
            if(ch >= '0' && ch <= '9'){
                stk.push(ch - '0');
            } else {
                int pop1 = stk.pop();
                int pop2 = stk.pop();
                
                if(ch == '+') stk.push(pop2 + pop1);
                else if(ch == '-') stk.push(pop2 - pop1);
                else if(ch == '/') stk.push(pop2 / pop1);
                else stk.push(pop2 * pop1);
            }
        }
        
        return stk.peek();
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        System.out.println(evaluatePostfix(str));
    }
}