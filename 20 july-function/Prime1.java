// no parameter and with return type
import java.util.*;
public class Prime1 {
	static int prime1()
	{
		int n,flag=1;
		System.out.println("Enter the no:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2;i<n;i++)
		{if(n%i==0)
			flag=1;
		else
			flag=0;
		}	
		 return flag;
	
	}
}
