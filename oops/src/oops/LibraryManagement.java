package oops;

public abstract class LibraryManagement//Base Class
{
	private int studentid;
	private String studentname;
	public void print()
	{

		System.out.println("Every library has a librarian");
	}
	abstract void display();
	public int getStudentid()
	{
		return studentid;
	}
	public String getStudentname()
	{
		return studentname;
	}
	public void setStudentid(int sid)
	{
		studentid=sid;

	}
	public void setStudentname(String sname)
	{
		studentname=sname;
	}

}

class Department  extends LibraryManagement implements Students//inheritance and Abstraction//Derived Class
{
	public void timing(String inTime)
	{
		System.out.println("Students checkIn Time"+" "+inTime);
	}
	public void timing(String inTime,String outTime)//OverLoading
	{
		System.out.println("Students checkIn Time" +" "+inTime);
		System.out.println("Students checkOut Time " +" "+inTime);
	}
	public void idcardissued(int num)//0verRidding
	{
		System.out.println("Each student has unique library id card num"+" " +num);
	}
	public void takebooks(int no)//0verRidding
	{
		System.out.println("Each student can take only"+" " +no +" "+"books");
	}
	public void display()
	{
		if(getStudentid()!=0)
		{
			System.out.println("Give Books");
		}

	}


	public static void main(String[] args)
	{
		Department lib=new Department() ;

		lib.print();
		lib.idcardissued(16);
		lib.takebooks(3);
		lib.takebooks(5);
		lib.timing("10.30Am", "11.30Am");
		lib.setStudentid(18);
		lib.getStudentid();
		lib.display();
		lib.setStudentname("Akshaya");
		System.out.println(lib.getStudentname());

	}


}