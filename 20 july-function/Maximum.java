// no parameter no return type
import java.util.*;
public class Maximum {
	static void max()
	{
		int n,max;
		System.out.println("Enter the array size:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+" array elements:");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		max=a[0];
		for(int i=0;i<n;i++)
			if(a[i]>max)
				max=a[i];
		
		System.out.println("max from array:"+max);
	}
}