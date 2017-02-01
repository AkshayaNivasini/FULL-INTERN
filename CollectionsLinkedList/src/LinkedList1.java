import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(15);
		l.add(null);
		l.add(16);
		System.out.println(l);
		l.addFirst(11);
		l.addLast(1995);
		l.add(45);
		System.out.println(l);
		l.getFirst();
		l.remove(1);
		System.out.println(l);
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		LinkedList<Float> l1=new LinkedList<Float>();
		l1.add(22.5f);
		l1.add(35.908f);
		l1.add(7890.00f);
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("Akshaya");
		l2.add(" ");
		l2.add("Nivasini");
		System.out.println(l2);
		l2.addFirst("M");
		System.out.println(l2);
		l2.addFirst("A");
		System.out.println(l2);
		l2.addLast("Meenakshi");
		l2.addLast("Sundaram");
		System.out.println(l2);




	}

}

