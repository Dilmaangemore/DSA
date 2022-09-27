import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int inv=0;
int op= 1;
while(n !=0){
  int od = n %10; ///original digit
    int id = op;  // inverted digit
  int ip = od;    // inverted position

  // make change to inv using ip id
  inv+= id * Math.pow(10, ip-1);
  n=n/10;
  op++;
}
System.out.println(inv);
 }
}