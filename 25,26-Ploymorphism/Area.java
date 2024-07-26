// Method Overloading
import java.util.Scanner;
class poly1{
double l,b,A,r, h;
void calArea()
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length & breadth :");
	l=sc.nextDouble();
	b=sc.nextDouble();
	A=l*b;
	System.out.println("Arae of rectangle :"+A);
  }
void calArea(double r){
	this.r=r;
		A=3.14*r*r;
		System.out.println("Area of circle :"+A);
	}
double calArea(double b,double h)
	{
		this.b=b;
		this.h=h;
		A=0.5*b*h;
		return(A);
	}
}
public class Area{
public static void main(String[] args) 
	{
	double r,h,b;
	Scanner sc=new Scanner(System.in);
	poly1 v1= new poly1();
		v1.calArea();
		System.out.println("Enter Radius:");
		r=sc.nextDouble();
		v1.calArea(r);
		System.out.println("Enter breadth & height :");
		b=sc.nextDouble();
		h=sc.nextDouble();
		double A=v1.calArea(b, h);
		System.out.println("Area :"+A);
	}
}

