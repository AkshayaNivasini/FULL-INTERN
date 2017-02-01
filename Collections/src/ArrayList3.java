import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList3 {
	ArrayList<String> l=new ArrayList<String>();

	public static void main(String[] args) {


		ArrayList3 al=new ArrayList3();

		al.breakfast();
		al.lunch();
		al.dinner();



	}
	public void breakfast() {
		Iterator itr=l.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());
		}

		l.add("dosa");
		l.add("Idly");
		l.remove(0);
		l.add("pongal");
		l.retainAll(l);
		System.out.println(l.indexOf("pongal"));
		//while(itr.hasNext()){
		//  itr.next();
		System.out.println(l);

		//}

	}
	public void lunch()
	{
		Iterator itr=l.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next()); 
		}
		l.add("mini lunch");
		l.add("bombay meals");
		l.remove(0);
		l.clear();
		l.add("full meals");
		l.removeAll(l);

		System.out.println(l.size());
		System.out.println(l);
	}
	public void dinner(){
		l.add("Chapathi");
		l.add("panner butter masala");
		l.add("gobi 65");

		System.out.println(l.size());
		Iterator itr=l.iterator();
		while(itr.hasNext()){  
			System.out.println(itr.next()); 
		}
		l.add("mushroom gravy");
		l.get(1);
		l.add(2,"papad");
		l.containsAll(l);



	}


}









