public class Dance//hierarchical inheritance
		 {
			 public void expressions()
			 {
				 String name="Eye movements";
				 System.out.println("In bharathanatyam"+name+" "+ "are important");
				 
			 }
			 
		 }
class Kuchipudi extends Dance
			 {
				 public void movements()
				 {
					 String name="Leg movements";
					 System.out.println("In kuchipudi"+name+" "+"are important");
					 
				 }
			 }
class Kathakali extends Dance
{
	public void gestures1()
	 {
		 String name="Hand gesture";
		 System.out.println("In bharathanatyam"+name+" "+" are important");
	 }

			 
			 public static void main(String[] args) {
				    
					Kuchipudi dance=new Kuchipudi();
					Kathakali dance1=new Kathakali();
					dance1.gestures1();
					dance.expressions();
					dance.movements();
					
				
		 }

	}


