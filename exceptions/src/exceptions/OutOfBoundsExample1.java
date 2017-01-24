package exceptions;

public class OutOfBoundsExample1 {



	public static void main(String[]args){

		int [] array = {5,8,14,16,23,42};

		System.out.println("The numbers are ...");
		try{
		for(int i = 0; i <= array.length; i++)
		{ 
			System.out.println(".."+array[i]);

		}  
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The array index is 6");
			System.out.println("Exception"+e);
		}
	}  
}
