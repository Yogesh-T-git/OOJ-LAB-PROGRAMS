
import java.lang.Math;
import java.util.Scanner;

class Qeq
{
	public static void main(String args[])
	{
		int a,b,c;
		double n,r1,r2;
		
		Scanner input = new Scanner(System.in);


		System.out.println("Enter the co-efficients");
		System.out.println("Co-efficient a - ");
		a=input.nextInt();
		System.out.println("Co-efficient b - ");
		b=input.nextInt();
		System.out.println("Co-efficient c - ");
		c=input.nextInt();

		n = (b*b)-4*a*c;
		
		if(n>0)
		  {
	          	System.out.println("roots are real and distinct");
			r1=((-b)+Math.sqrt(n))/(2*a);
			r2=((-b)-Math.sqrt(n))/(2*a);
			System.out.println("r1 - " + r1 + "r2 - " + r2);
		  }

		if(n==0)
		  {
	          	System.out.println("roots are real and equal");
			r1=r2=(-b)/(2*a);
			System.out.println("r1 - " + r1 + " r2 - " + r2);
		  }		

		if(n<0)
		  {
	          	System.out.println("there are no real solution");
		  }	
	}



}
