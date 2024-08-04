import java.util.Scanner;
class Employee 
{	int eid;
	String name;
	double salary;
	static int cnt;
	Employee()
	{
		cnt++;
		eid=101;
		name="Om";
		salary=10000;		
	}
	Employee(int eid,String name,double salary)
	{
		cnt++;
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}	
	void display()
	{
		System.out.println(eid+"\t"+name+"\t"+salary);		
	}	
	static void count()
	{
		System.out.println("No of object="+cnt);	
	}	
}
public class EmployeeInfo 
{

	public static void main(String[] args) 
	{
		int eid,i;
		String name;
		double salary;
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee();
		e1.display();
		Employee.count();
		System.out.println("Enter id ,name & salary");
		eid=sc.nextInt();
		name=sc.next();
		salary=sc.nextDouble();
		Employee e2=new Employee(eid,name,salary);
		e2.display();
		Employee.count();
		System.out.println("Enter id ,name & salary");
		eid=sc.nextInt();
		name=sc.next();
		salary=sc.nextDouble();
		Employee e3=new Employee(eid,name,salary);
		e3.display();
		Employee.count();
		
	}
}