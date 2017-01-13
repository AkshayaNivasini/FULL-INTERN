//static block and static method and static variable

public class Employee {
	static int a=10;

	static
	{
		final int empid=90;
		String companyname="FULL CREATIVE";
		String workinghours ="9 hours";
		System.out.println(empid+" "+companyname+" "+workinghours);
	}
	public static void working()
	{
		int salary=300000;
		System.out.println("Employee salary "+salary);
	}


	public static void main(String[] args) {
		System.out.println(a);

		Employee.working();


	}

}
