import java.util.Scanner;
public class Employee {
	
int e_id;
String e_name;
double salary;
Employee(){
	e_id=1;
	e_name="om";
	salary=500000;
}
void display()
{
	System.out.println("Employee Id :"+e_id);
	System.out.println("Employee Name :"+e_name);
	System.out.println("Employee Salary:"+salary);

}

public static class Employee_demo{

	public  static void main(String[] args) {
Employee e1=new Employee();
e1.display();

	}
}
}
