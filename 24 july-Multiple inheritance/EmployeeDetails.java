import java.util.Scanner;
class Emp
{
double id;
   String name,desg;
Emp (Double id,String name,String desg)
    {
        this.id=id;
        this.name=name;
this.desg=desg;
    }

	public void display()
    {
System.out.println("id:"+id);
System.out.println("name :"+name);
System.out.println("Designation :"+desg);
    }
}

class partTime extends Emp
{
double hrRate,sal;
int nHrs;
	
partTime(Double id,String name,String desg,int nHrs,double hr_Rate)
    {
super(id,name,desg);
this.nHrs=nHrs;
this.hrRate=hrRate;       
    }
public void  calSalary()
    {
System.out.println("No of hr:"+nHrs);
System.out.println("Hr rate:"+hrRate);
sal=(nHrs*hrRate);
System.out.println("Salary:"+sal);
    }
}
class FullTime extends Emp
{
double dayRate,sal;
int nDay;	
FullTime(Double id,String name,String desg,int nDay,double dayDate)
    {
super(id,name,desg);
this.nDay=nDay;
this.dayRate=dayRate;       
    }
public void  calSalary()
    {
System.out.println("No of hours:"+nDay);
System.out.println("Hours rate:"+dayRate);
System.out.println("Salary:"+(nDay*dayRate));
    }
}
public class EmployeeDetails
{
	public static void main(String[] args) 
	{
		double id;
		    String name,desg;
		double hrRate;
		int nHrs,ch;
		double dayRate;
		int nDay;
		    Scanner sc=new Scanner(System.in);
		do
		    {
	System.out.println("1:Accept details of part time employee :");
	System.out.println("2:Accept details of full time employee :");
	System.out.println("3:Exit");
	System.out.println("enter your choice");
	ch = sc.nextInt();
	
	switch(ch)
	        {
	case 1:
		System.out.println("Enter id,name& designation,no of hours,hours rate");
	id=sc.nextDouble();
	name=sc.next();
	desg=sc.next();
	nHrs=sc.nextInt();
	hrRate=sc.nextDouble();
	partTime p1=new partTime(id, name, desg, nHrs, hrRate);
	p1.display();
	            p1.calSalary();
		
		break;
	case 2:
		System.out.println("Enter id,name ,designation,no of Day,day rate");
	id=sc.nextDouble();
	name=sc.next();
	desg=sc.next();
	nDay=sc.nextInt();
	dayRate=sc.nextDouble();
	FullTime f1=new FullTime(id, name, desg, nDay, dayRate);
	f1.display();
	            f1.calSalary();
		break;
	case 3:
		System.exit(0);
		break;
		default:System.out.println("Invalid choice");
	        }	
		}while(ch<=3);
}
}
