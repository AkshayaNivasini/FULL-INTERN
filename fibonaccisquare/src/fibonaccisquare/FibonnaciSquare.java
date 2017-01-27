package fibonaccisquare;

public class FibonnaciSquare {
	public void timetest()
	{
		long start=System.currentTimeMillis();
		long op=0,f0=0,f1=1,f2=0;
		while(f2<1000000){
			op=f0+(f1*f1);
			System.out.println(op);
			f2=f0+f1;
			f0=f1;
			f1=f2;
		}
		long stop=System.currentTimeMillis();
		long totalRuntime=stop-start;
		System.out.println("Total runtime "+totalRuntime+"ms");
	}
	public static void main(String[] args) {
		FibonnaciSquare fs=new FibonnaciSquare();
		fs.timetest();



	}
}





