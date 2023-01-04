import java.io.*;
import java.util.*;

public class Solution {
    public static int reverse(int num){
        Stack<Integer> stk = new Stack<>();
        
        // 1. fill the stack
        while(num > 0){
            int digit = num % 10;
            stk.push(digit);
            num = num / 10;
        }
        
        // 2. clear the stack
        int res = 0, power = 1;
        
        while(stk.size() > 0){
            int digit = stk.pop();
            
            res = res + digit * power;
            power = power * 10;
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();
        
        for(int t = 0; t < tests; t++){
            int num = scn.nextInt();
            System.out.println(reverse(num));
        }
    }
}