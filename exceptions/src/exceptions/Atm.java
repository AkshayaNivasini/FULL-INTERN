package exceptions;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args)


	{

		try{
			int pin;
			int originalPin = 9016;
			System.out.println("Enter the pin number");
			Scanner sc = new Scanner(System.in);
			pin = sc.nextInt();
			if (pin==originalPin)
			{
				System.out.println("Pin is correct");
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Exception:");
		}



	}
}



