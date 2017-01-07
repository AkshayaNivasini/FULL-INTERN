package inheri2;//Multilevel Inheritance

public class Music {

	public static void main(String[] args) {
		
		WindInstruments instrument1=new WindInstruments();
		instrument1.airInstruments();
		instrument1.blowInstruments();
		PercussionInstruments instrument2=new PercussionInstruments();
		instrument2.hitInstrument();
		instrument2.stirngInstruments();
	    TypeInstruments instrument3=new TypeInstruments();
		instrument3.typing();
		}
}
class WindInstruments
{		
	public void airInstruments()
	{
		String name="Flute";
		System.out.println("Wind instruments play when wind flows accoridng to it.Example"+" "+name);
	    
	}
   
	public void blowInstruments()
	{
		String name="Saxaphone";
		System.out.println("Brass instruments play when we blow it.Example"+" "+name);
	}
	}
	
	 class PercussionInstruments extends WindInstruments
	{
		
	public void hitInstrument()
	{
      String name="Drums";
      System.out.println("Percussion instruments play when we hit it.Example"+" "+name);
	}
	public void stirngInstruments()
	{
		String name="Violin";
		System.out.println("String instruments play when we pluck the strings.Example"+" "+name);
	}
	
	}
	 class TypeInstruments extends PercussionInstruments
	 {
		 public void typing()
		 {
		 String name="trumpet";
	     System.out.println("Brass instruments play when they are hit.example"+" "+name);
	 }
	 }
