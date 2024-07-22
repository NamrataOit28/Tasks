import java.util.Scanner;
// no parameter and with return type
import java.util.*;
public class Dissarium1 {

	static int dissarium1()
	{
		int n,cnt=0,n1,f=1,flag=0;
		System.out.println("Enter the no:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int p=n,sum=0;
		while(n>0)
		{
			n1=n%10;
			cnt++;
			n=n/10;
		}
		int no=p;
		while(p>0)
		{
			n1=p%10;
			f=1;
			for(int i=cnt;i>0;i--)
			{
				f=f*n1;
			}
			sum+=f;
			cnt--;
			p=p/10;
			
		}
		if(sum==no)
			flag=1;
		else
			flag=0;
		
		return flag;
			
	}

}
