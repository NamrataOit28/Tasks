// method overriding
import java.util.*;
class Date 
{ 
int dd; int mm; int yy; 
 public Date()
 {  
	 dd=mm=yy=0; } 
 public Date(int d,int m,int y){ 
dd=d; mm=m; yy=y; 
 } 
 public String toString() { 
 return dd+"/"+mm+"/"+yy; 
 } 
} 
 
class Employee 
{ 
int empID; String ename; Date bdate; 
int wdays;
 double rate; 
 public Employee() {} 
 public Employee(int eid,String n, Date d, int wd,double r){ 
empID=eid; ename=n; bdate=d; wdays=wd; rate=r; 
 } 
}
class Manager extends Employee 
{ 
 double salary; 
Manager()
{ 
super(); salary=0; 
 } 
Manager(int eid, String s,Date d,int wd, double rate)
{
	super(eid,s,d,wd,rate); 
	} 
 public double computesal() 

{ 
	 return (wdays*rate); 
	 } 
 public String toString() 
{
	 return
empID+"\n"+ename+"\n"+bdate+"\n"+wdays+"\n"+rate+"\n"+this.computesal();
 } 
} 
class SalesManager extends Manager 
{ 
 double sales; double comm; 
SalesManager() 
{ 
	super(); sales=0; comm=0; } 
SalesManager(int eid,String n, Date d,int wd,double r,double s,double c) 
 { 
 super(eid,n,d,wd,r); 
 sales=s; comm=c; 
 } 
 public double computesal(){ 
 if (sales > 1000) 
 return(super.computesal()+sales*comm); 
 else 
 return(super.computesal()); 
 } 
 public String toString(){ 
 return(empID+"\n"+ename+"\n"+bdate+"\n"+wdays+"\n"+rate+"\n"+this.computesal());
 }
}
 public class EmployeeInfo{
 public static void main(String[] args) 
 { 
 Date d1=new Date(28,04,2022); 
 Employee e1=new Employee(10,"ABC",d1,23,100.50); 
 Manager m1=new Manager(10,"XYZ",d1,23,200.50); 
System.out.println(m1); 
 Date d2=new Date(04,04,2024); 
SalesManager sm1=new SalesManager(20,"PRR",d2,27,150,1500,10.5); 
System.out.println(sm1); 
 }
}
