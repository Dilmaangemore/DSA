import java.io.*;
import java.util.*;

public class Solution {

    static int MinimuminArr(int [] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){

            if(arr[i]<min){

                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(MinimuminArr(arr));
}
}