/*
Area and perimeter as double using function
Problem
Submissions
Leaderboard
Discussions
The process goes like:

Take in radius as a double input,

Then make two functions findArea(double radius) which returns the area as a double to a double type variable named doubleArea and findPerimeter(double radius) which returns the perimeter as a double to a double type variable name doublePerimeter.

Then in the end print doubleArea in one line,

And print doublePerimeter in the second line.

Input Format

For each test case, Radius will be given as a double input to

Constraints

0<=radius<=2^10

Output Format

Print the area in the first line as a double output

And print the perimeter in the second line as a double output.

Sample Input 0

2.0
Sample Output 0

12.56
12.56
Sample Input 1

3.0
Sample Output 1

28.259999999999998
18.84
Sample Input 2

4.5
Sample Output 2

63.585
28.26
Sample Input 3

6.2
Sample Output 3

120.7016
38.936
Sample Input 4

7.3
Sample Output 4

167.3306
45.844
*/
import java.io.*;
import java.util.*;

public class Solution {
    
public static double findArea(double r){
    
    double area=3.14*r*r;
   
    return area;
   }
    public static double  findPerimeter(double r) {
         double perimeter = 3.14 * 2* r;
        
       return perimeter;
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        
        System.out.println(findArea(r));
        System.out.println(findPerimeter(r));
        
    }
}