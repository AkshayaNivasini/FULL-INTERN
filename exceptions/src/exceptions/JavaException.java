package exceptions;

import java.util.Scanner;

class JavaException{
	public void number(){

		try
		{
			int a;
			System.out.println("Enter the value of a");
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();

		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("hi");
		}
	}
	public static void main(String args[])
	{
		JavaException je=new JavaException();
		je.number();


	}
}