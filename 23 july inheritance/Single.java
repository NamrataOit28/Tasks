import java.util.Scanner;
class Area 
{
	double r,A;
	Area(double r)
	{
		this.r=r;
	}
void cal_area()
    {
	A=3.14*r*r;
	System.out.println("Radius="+r+"\nArea="+A);
    }
}
class Volume extends Area
{
	double h,v;
	Volume(double r,double h)
	{
		super(r);
		this.h=h;
		
	}
	void cal_vol()
	{
		
		v=A*h;
		System.out.println("H="+h+"\nVolume="+v);
	}
}
public class Single
{

	public static void main(String[] args) 
	{
	double r,h;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter r & h");
	r=sc.nextDouble();
	h=sc.nextDouble();
	Volume v1= new Volume(r, h);
		v1.cal_area();
		v1.cal_vol();
	}

}
