
import java.util.Scanner;
 class Employee1 {
int e_id;
String name;
double salary;
Employee1()//default constructor
{
	e_id=101;
	name="sai";
	salary=10000;
}
Employee1(int e_id,String name,double salary)//parameterized constructor
{
	this.e_id=e_id;
	this.name=name;
	this.salary=salary;
}
void display() {
	System.out.println(e_id+"\t"+name+"\t"+salary);
}
}
public class MultiConstructor{

	public static void main(String[] args) {
		Employee1 e=new Employee1();//non-parameterized
		e.display();
		int e_id,i;
		String name;
		double salary;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no of records :");
		int n=sc.nextInt();
		Employee1 e1[]=new Employee1[n];//Array creation
		for(i=0;i<n;i++) {
			System.out.println("Enter Employee id ,Employee Name ,Employee Salary ");
			e_id=sc.nextInt();
			name=sc.next();
			salary=sc.nextDouble();
			e1[i]=new Employee1(e_id,name,salary);//object creation
		}
		System.out.println("Employee id:\tRmployee Nane:\tEmployee Salary:");
		System.out.println("______________________________________________________");
		for(i=0;i<n;i++)
			e1[i].display();
	}
	
	}


