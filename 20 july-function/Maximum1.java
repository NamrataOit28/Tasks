// no parameter and with return type
import java.util.*;
public class Maximum1 {

	static int max1()
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
		
		return max;
	}
	

}
