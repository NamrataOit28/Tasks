// no parameter and with return type
import java.util.*;
public class armstrong1{
	
	static int armstrong1()
	{
		int n,n1,sum=0,flag=0;
		System.out.println("Enter the no:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int p=n;
		while(n>0)
		{
			n1=n%10;
			sum=sum+(n1*n1*n1);
			n=n/10;
		}
		if(sum==p)
			flag=1;
		else
			flag=0;	
			return (flag);
			
	   }
}
