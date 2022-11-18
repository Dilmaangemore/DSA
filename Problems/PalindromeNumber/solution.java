class Solution
{
    public String is_palindrome(int n)
    {
        // if n <0 
        // if number should not be 0 either last digit is zero
        
        // Code here
        if(n<0 || (n!=0 && n%10 == 0)){
            return "No";
        }
        int rev =0;
        int num =n;
        while(num>0){
            int digit = num%10;
            rev = rev*10+digit;
            num=num/10;
        }
        if(n == rev){
            return "Yes";
        }
        return "No";
    }
}