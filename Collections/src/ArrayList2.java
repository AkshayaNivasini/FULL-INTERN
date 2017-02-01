import java.io.Serializable;
import java.util.*;
public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1=new ArrayList<String>();
		LinkedList<String> l2=new LinkedList<String>();
		System.out.println(l1 instanceof Serializable);
		System.out.println(l2 instanceof Cloneable);
		System.out.println(l1 instanceof RandomAccess);
		System.out.println(l2 instanceof RandomAccess);


	}

}
