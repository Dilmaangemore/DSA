class Solution {
    public boolean isPalindrome(String s) {
       
        String str=s.toLowerCase();
        
         int p1 =0;      //left pointer
        
        int p2 =str.length()-1;  //right pointer
        
      
        
        while(p1<=p2){
            if(!Character.isLetterOrDigit(str.charAt(p1))){
                p1++;
            }else if(!Character.isLetterOrDigit(str.charAt(p2))){
                p2--;
            }
            else{
                if(str.charAt(p1) != str.charAt(p2))
                {
                    return false;
                }
                p1++;
                p2--;
            }
        }
        return true;
        
    }}