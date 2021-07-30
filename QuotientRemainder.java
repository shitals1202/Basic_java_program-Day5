package Day5;

import java.util.Scanner;
public class QuotientRemainder {

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter an Dividend:");
        int dividend=sc.nextInt();
        System.out.println("eneter an quotient:");
        int divisor=sc.nextInt();
    int quotient = dividend / divisor;
    int remainder = dividend % divisor;

    System.out.println("Quotient = " + quotient);
    System.out.println("Remainder = " + remainder);
  }
}
