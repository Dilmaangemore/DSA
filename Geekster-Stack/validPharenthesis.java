import java.io.*;
import java.util.*;

public class Solution {
    public static boolean validParantheses(String str){
        Stack<Character> stk = new Stack<>();
        
        for(int idx = 0; idx < str.length(); idx++){
            char ch = str.charAt(idx);
            
            if(ch == '('){
                stk.push('(');
            } else if(ch == ')'){
                if(stk.size() == 0) return false; // closing braces are extra
                stk.pop();   
            }
        }
        
        if(stk.size() > 0) return false; // opening braces are extra
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        System.out.println(validParantheses(str));
    }
}