package Day5;
import java.util.Scanner;
public class even_odd {
        public static void main(String[] args){
        int no;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        no=sc.nextInt();
        if(no % 2 == 0)
        System.out.println("This is even number");
        else
        System.out.println("This is odd number");
}
}
