import java.util.Scanner;
class Student
{
	int rno;
	String name;
	float per;
	static int cnt=0;
	Student()
	{
		rno=1;
		name="Sai";
		per=80;
		cnt++;
	}
	Student(int rno,String name,int per)
	{
		this.rno=rno;
		this.name=name;
		this.per=per;
		cnt++;
	}
	
	void Display()
	{
		System.out.println("Roll No : "+rno+" Name : "+name +"Percentage : "+per);
	}
	
	void accept()
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Roll No : ");
		rno=scr.nextInt();
		System.out.println("Name : ");
		name=scr.next();
		System.out.println("Percentage : ");
		per=scr.nextFloat();
	}
	
	static void sortStud(Student[] D)
	{
	int i,j;
	Student temp;
	for(i=0;i<cnt;i++)
        {
		for(j=i+1;j<cnt;j++)
        	{
			if(D[i].per>D[j].per)
			{
			temp=D[i];
			D[i]=D[j];
			D[j]=temp;
			}
		}
	}
	}
}
	
	class SortStud
	{
	
	public static void main(String args[])
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter How Many Students:");
		int tot=scr.nextInt();
		int i;
		Student []D=new Student[tot];
		for(i=0;i<tot;i++)
		{
		D[i]=new Student();
		D[i].accept();
		}
		for(i=0;i<tot;i++)
                		{
		D[i].Display();
		}
		Student.sortStud(D);
		System.out.println("After Sorting");
		for(int i1=0;i1<tot;i1++)
		{
	        D[i1].Display();
		}
	}
	
}