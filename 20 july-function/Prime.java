//no parameter & no return value
import java.util.Scanner;

public class Prime {
	 static Scanner sc=new Scanner(System.in);
	
	 static void prime()
	{
		int n,flag=1;
		System.out.println("Enter the no:");
		n=sc.nextInt();
		for(int i=2;i<n;i++)
		{if(n%i==0)
			flag=1;
		else
			flag=0;
		}	
		if(flag==1)
			System.out.println("Not prime");
		else
			System.out.println("prime");
	
	}
}
