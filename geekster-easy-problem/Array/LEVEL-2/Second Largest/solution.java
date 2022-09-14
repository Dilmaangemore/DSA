import java.io.*;
import java.util.*;

public class Solution {

    static int SecondLargest(int[] arr, int n){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
               secondLargest = largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(SecondLargest(arr, n));
    }
}