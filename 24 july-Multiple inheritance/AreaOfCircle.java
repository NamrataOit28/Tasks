import java.util.*;
class Area
{
double r,A;
Area(double r)
{
	this.r=r;
	}

void calArea()
{
A=3.14*r*r;
System.out.println("Area="+A);
}
}


class volume extends Area
{
double h,v;
volume(double r,double h)
{
super(r);
this.h=h;
} 
void calVol()
{
calArea();
v=A*h;
System.out.println("Volume="+v);
}
}


class volume1 extends volume
{
double l,v1;
volume1(double r,double h,double l)
{
super(r,h);
this.l=l;
} 
void calVol1()
{
calVol();
v1=v*l;
System.out.println("Volume1="+v1);
}
}

public class AreaOfCircle
{

	public static void main(String[] args)
{
		double r,h,l;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter radius,Height,Length :");
		r=sc.nextDouble();
		h=sc.nextDouble();
		l=sc.nextDouble();
		volume1 v1=new volume1(r,h,l);		
		v1.calVol1();
	}
}
