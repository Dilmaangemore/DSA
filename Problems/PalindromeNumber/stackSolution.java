class Solution
{
    public String is_palindrome(int n)
    {
        Stack<Integer> stk = new Stack<>();
        
        int dummy = n;
        
        while(dummy > 0){
            stk.push(dummy%10);
            dummy=dummy/10;
        }
        
        while(!stk.empty()){
            if(stk.peek() != n%10){
                return "No";
            }
            stk.pop();
            n=n/10;
        }
        return "Yes";
    }
}
		    
