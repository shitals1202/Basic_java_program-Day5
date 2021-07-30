package Day5;

import java.util.Scanner;
public class swap_no {

        public static void main(String[] args){
                int x,y;
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter fiest number");
                x=sc.nextInt();
                System.out.println("Enter second number");
                y=sc.nextInt();
                x = x + y;
                y = x - y;
                x=  x - y;
                System.out.println("value after swapping:" + x+ " " + y);
        }
}

