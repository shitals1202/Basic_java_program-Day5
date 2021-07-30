package Day5;

import java.util.Scanner;

public  class Flip_flop {
	public static void main(String[] args){
		CoinToss test = new CoinToss();
	int choice;
	System.out.println("Welcome to COin flipflop game");
	
	do
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter '1' to flipflop or enter '0' to quit");
		choice = sc.nextInt();
	
		if(choice ==1)
		{
			test.flip();
		}
		else if(choice>1)
		{
			System.out.println("Invalid Entry - please enter 1 or 0:");
			choice = sc.nextInt();
		}
	
	}
	while(choice != 0); 
	}
}