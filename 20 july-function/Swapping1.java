// no parameter and with return type

import java.util.Scanner;
public class Swapping1 {
	static int[] swap1()
	{
		int a[]=new int[2];
		int n;
		System.out.println("Enter the value of a and b:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<2;i++)
			a[i]=sc.nextInt();
		
		int i=0;
			a[i]=a[i]+a[i+1];
			a[i+1]=a[i]-a[i+1];
			a[i]=a[i]-a[i+1];
			
		return a;
		
			
			
		
	}
	
}
