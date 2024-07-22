
import java.util.*;

public class Main {
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
	static void armstrong()
	{
		int n,n1,sum=0;
		System.out.println("Enter the no:");
		n=sc.nextInt();
		int p=n;
		while(n>0)
		{
			n1=n%10;
			sum=sum+(n1*n1*n1);
			n=n/10;
		}
		if(sum==p)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");		
	   }
	static void max()
	{
		int n,max;
		System.out.println("Enter the array size:");
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
	static void dissarium()
	{
		int n,cnt=0,n1,f=1;
		System.out.println("Enter the no:");
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
			System.out.println("Dissarium");
		else
			System.out.println("Not Dissarium");
			
	}
	static void circle()
	{
		double r;
		System.out.println("Enter the radius:");
		r=sc.nextDouble();
		double area=3.14*r*r;
		System.out.println("Area of circle:"+area);
		
	}
	static void pronic()
	{
		int n,no,flag=0;
		System.out.println("Enter the array size:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+" array elements:");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("pronic nos:");
		for(int i=0;i<n;i++)
		{ flag=0;
			no=a[i];
			for(int j=1;j<no;j++)
			{
				if(no==j*(j+1))
					flag=1;
					
			}
			if(flag==1)
				System.out.print(" "+a[i]);
				   
			
		}
	}
	
	static void swap()
	{
		System.out.println("enter the value of a and b:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:"+a+" b:"+b);
	}
	static int prime1()
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
		 return flag;
	
	}
	static int armstrong1()
	{
		int n,n1,sum=0,flag=0;
		System.out.println("Enter the no:");
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
	
	static int max1()
	{
		int n,max;
		System.out.println("Enter the array size:");
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
	
	static int dissarium1()
	{
		int n,cnt=0,n1,f=1,flag=0;
		System.out.println("Enter the no:");
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
	static double circle1()
	{
		double r;
		System.out.println("Enter the radius:");
		r=sc.nextDouble();
		double area=3.14*r*r;
		return area;
		
		
	}
	static int[] pronic1()
	{
		int n,no,flag=0;
		System.out.println("Enter the array size:");
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
	
	static int[] swap1()
	{
		int a[]=new int[2];
		System.out.println("Enter the value of a and b:");
		for(int i=0;i<2;i++)
			a[i]=sc.nextInt();
		
		int i=0;
			a[i]=a[i]+a[i+1];
			a[i+1]=a[i]-a[i+1];
			a[i]=a[i]-a[i+1];
			
		return a;
		
			
			
		
	}
	
	static int[] pattern()
	{
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				a[j]=1;
			}
		}
		return a;
	}
	
	
	
		
	public static void main(String[] args) {
		
      // prime();
	/*	int flag=prime1();
		if(flag==1)
			System.out.println("Not prime");
		else
			System.out.println("prime");
		*/
		
      // armstrong();
		/*int flag=armstrong1();
		if(flag==1)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");	
		*/
		
	  //max();
		/*
		int max=max1();
		System.out.println("max from array:"+max);
		*/
		
		//dissarium();
		/*
		int flag=dissarium1();
            if(flag==1)
				System.out.println("Dissarium");
			else
				System.out.println("Not Dissarium");
			*/
		

		
		
		//circle();
		//double area=circle1();
		//System.out.println("Area of circle:"+area);
		
		//pronic();
		/*int num[]=pronic1();
		for(int i=0;i<num.length;i++)
			if(num[i]!=0)
			System.out.print(" "+num[i]);
		*/
			
		
		//swap();
		int a[]=swap1();
		    System.out.println("a:"+a[0]);
			System.out.println("b:"+a[1]);
			
			
		/*int a[]=pattern();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=i;j++)
			System.out.print(" "+a[j]);
		System.out.println();
		}
		*/
		
	}

}
