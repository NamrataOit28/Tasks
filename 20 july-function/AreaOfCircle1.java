// no parameter and with return type
import java.util.*;
public class AreaOfCircle1 {
	static double circle1()
	{
		double r;
		System.out.println("Enter the radius:");
		Scanner sc=new Scanner(System.in);
		r=sc.nextDouble();
		double area=3.14*r*r;
		return area;
		
		
	}

}
