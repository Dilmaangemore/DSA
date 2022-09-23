import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
      // write ur code here
      int t = scn.nextInt();
    for (int i = 0; i < t; i++) {
      int n = scn.nextInt();
      int count = 0;
      for (int div = 1; div <= n; div++) {
        if (n % div == 0) {
          count++;
        }
      }
      if (count == 2) {
        System.out.println("prime");
      } else {
        System.out.println("notprime");
      }
    }
  
  }
  }
/******************************************************************************



*******************************************************************************/
import java.util.*;


public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int t = scn.nextInt();
    for (int i = 0; i < t; i++) {
      int n = scn.nextInt();
      boolean flag = true;
      for (int j = 2; j*j <= n; j++) { //j=3
        if (n % j == 0) { //3%3 ==0 retuen false
//but we know 3 is prime.
          flag = false;
          break;
        }
      }
      if (flag) {
        System.out.println("prime");
      } else {
        System.out.println("not prime");
      }
    }

  }
}
/******************************************************************************



*******************************************************************************/
import java.util.*;


public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    for (int i = 0; i < t; i++) {
      int n = scn.nextInt();

      int div = 2;
      while (div * div <= n) {
        if (n % div == 0) {
          break;
        }
        div++;
      }

      if (div * div > n) {
        System.out.println("prime");
      } else {
        System.out.println("not prime");
      }
    }

  }
}