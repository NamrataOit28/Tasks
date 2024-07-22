import java.util.Scanner;
public class AreaOfCircle
{
	double r,A;
	int n,i;
	
	AreaOfCircle()
	{
		r=0.0;
	}
	AreaOfCircle(double r)
	{
		this.r=r;
	}
	double cal_area()
	{
		A=3.14*r*r;
		return(A);
	}
                    public static void main(String[] args) 
	{
		double r1,A;
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no of records");
		int n=sc.nextInt();

		AreaOfCircle  a1[ ]=new AreaOfCircle [n];//array creation
      	for(i=0;i<n;i++)
      	{	
		System.out.println("Enter value of r");
		r1=sc.nextDouble();
		 a1[i]=new AreaOfCircle(r1);
		A=a1[i].cal_area();
		System.out.println("Area="+A);
	}
	}

}