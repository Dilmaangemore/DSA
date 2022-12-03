/*
https://practice.geeksforgeeks.org/problems/reversal-algorithm5340/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=reversal-algorithm
*/
//User function Template for Java

class Solution {
    void leftRotate(int[] arr, int n, int d) {
        // code here
       int [] temp = new int[arr.length];
         
       
        int j =0;
        for(int i=d; i<arr.length; i++){
            temp[j]=arr[i];
            j++;
        }
        
        for(int i=0; i<d; i++){
            temp[j]=arr[i];
            j++;
        }
       // temp[n-k]=arr[0];
        for(int i=0; i<n; i++){
            arr[i]=temp[i];
        }
         
    }
}