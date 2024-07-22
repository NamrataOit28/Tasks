import java.util.Scanner;
// no parameter and with return type
import java.util.*;
public class Pronic1 {
	static int[] pronic1()
	{
		int n,no,flag=0;
		System.out.println("Enter the array size:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+" array elements:");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int num[]=new int[n];
		int k=0;
		System.out.println("pronic nos:");
		for(int i=0;i<n;i++)
		{ flag=0;
			no=a[i];
			for(int j=1;j<no;j++)
			{
				if(no==j*(j+1))
				{	
					num[k]=no;
					k++;
				
				}  
					
			}	   
			
		}
	return num;
	}
	
}
