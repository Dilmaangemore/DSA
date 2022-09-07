/**************Leetcode 238****************
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int [] prefixProduct = new int[nums.length];
        prefixProduct[0]=1;
        
        // traverse nums[]
        // fetch prefixProduct at indexs i 
        // nums[] = {1,2,3,4}
        // pp@0 = 1; pp @ 1 = 1; pp @ 2 = 2*1=2; pp@ index 3 = 1*2*3= 6
        
        for(int i =1; i<nums.length; i++){
            prefixProduct[i]=prefixProduct[i-1]*nums[i-1];
            // pp[1]= pp[1-1]*nums[1-1]=pp[0]*nums[0]= 1*1=1;
            // pp[2] = pp[1]*nums[1]= 1*2=2;
            // pp[3] = pp[3-1]*nums[3-1]= pp[2]* nums[2]= 2*3 = 6
        
        }
        
        // prefixproduct[]={1, 1, 2, 6}
            // nums[] = {1,2,3,4}
 
        int suffixProduct = 1; // 4 12 24
        
        for(int i=nums.length-1; i>=0; i--){
            
            prefixProduct[i]= prefixProduct[i] * suffixProduct;
            // pp[3]= pp[3]*sp= 6*1=6
            //pp[2]= pp[2]* sp = 3*4=12
            //pp[1] = pp[1]* sp = 1*12 = 12;
            //pp[0] = pp[0]*sp = 1* 24 = 24
            
            suffixProduct=suffixProduct * nums[i];
            // sp = 24 12 4 1
        }
        return prefixProduct;
    }
}