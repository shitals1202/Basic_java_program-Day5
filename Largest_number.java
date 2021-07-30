package Day5;
import java.util.Scanner;

public class Largest_number {
	public static void main(String[] args){
		int m, n, p, largest, temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		m= sc.nextInt();
		System.out.println("Enter second number");
		n= sc.nextInt();
		System.out.println("Enter Third number");
		p= sc.nextInt();
		temp = m>n?m:p;
		largest= p>temp?p:temp;
		System.out.println("The largest number is: " +largest);
		
	}
}