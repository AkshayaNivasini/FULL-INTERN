package inheri3;

public class Dance {

	public static void main(String[] args) {
		
		Kuchipudi dance=new Kuchipudi();
		dance.expressions();
		dance.gestures();
		dance.movements();
		
	
	}
	
		
		 class Bharathanatyam
		 {
			 public void expressions()
			 {
				 String name="Eye movements";
				 System.out.println("In bharathanatyam"+name+" "+ "are important");
				 
			 }
			 public void gestures()
			 {
				 String name="Hand gesture";
				 System.out.println("In bharathanatyam"+name+" "+" are important");
			 }
			 class Kuchipudi extends Bharathanatyam
			 {
				 public void movements()
				 {
					 String name="Leg movements";
					 System.out.println("In kuchipudi"+name+" "+"are important");
					 
				 }
			 }
		 }

	}


