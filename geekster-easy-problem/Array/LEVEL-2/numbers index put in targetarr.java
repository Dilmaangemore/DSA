/*
Give the name numbers to the first array and indexes to the second array.

Then take n as an integer input representing size of both array.

Take n integer inputs for numbers array and Then take n integer inputs for array indexes where each integer input can be from 0 till numbers.length.

Then create an array of size n and name it target array. From left to right read numbers[i] and index[i], and in the target array at the index index[i], insert the value numbers[i].

Input Format

number n representing size of array numbers and indexes

n number representing element of numbers.

n number representing element of indexes.

Constraints

1<=n<=100000
0<=numbers[index]<=100000
0<=indexex[index]
Output Format

n numbers representing element of target array.

Sample Input 0

5
12 13 14 15 16
0 1 2 3 4
Sample Output 0

12 13 14 15 16
Explanation 0

for target array we are storing numbers[index] at every target[indexes[i]].

therfore target[index[0]] = numbers[0], i.e target[0]= 12.
*/


import java.io.*;
import java.util.*;

public class Solution {


   public static void readIndexNum(int[] numbers, int [] index, int n){
        int [] target = new int[n];
        for(int i=0; i<numbers.length; i++){
            
                target[index[i]]=numbers[i];
            
        }
       for(int i=0; i<n; i++){
           System.out.print(target[i]+" ");
       }
   
    }
    public static void main(String[] args) {
     
             Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] numbers = new  int[n];
        for(int i=0; i<n; i++){
            numbers[i]=sc.nextInt();
        }
        int [] index= new int[n];
        for(int i=0; i<n;  i++){
            index[i]=sc.nextInt();
        }
        readIndexNum(numbers, index, n);
    }
}