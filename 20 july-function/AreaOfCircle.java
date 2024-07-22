//no parameter and no return type
import java.util.*;
public class AreaOfCircle {
	static void circle()
	{
		double r;
		System.out.println("Enter the radius:");
		Scanner sc=new Scanner(System.in);
		r=sc.nextDouble();
		double area=3.14*r*r;
		System.out.println("Area of circle:"+area);
		
	}
}
