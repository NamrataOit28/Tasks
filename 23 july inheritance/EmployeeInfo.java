import java.util.*;
    class Employee1
    {
        int eid;
        double bs;
        String ename;
        Employee1(int eid , String ename , double bs)
        {
            this.eid=eid;
            this.ename=ename;
            this.bs=bs;
        }
        double getsalary()
        {
            return bs;
        }
        void display()
        {
            System.out.println("Employee id is " + eid);
            System.out.println("Employee name is " + ename);
            System.out.println("Employee base salary is " + bs);
        }
    }
class Manager1 extends  Employee1
{
    double ta,da,gs,hra;
    Manager1(int eid,String ename,double bs)
    {
        super(eid,ename,bs);
        
    }
    void cal_sal()
    {
        hra=getsalary()*0.50;
        ta=getsalary()*0.40;
        da=getsalary()*0.30;
        gs=getsalary()+hra+ta+da;
    }
    void show()
    {
        System.out.println("Total gross salary is " + gs);
     
    }
        
}
public class EmployeeInfo
{
    public static void main(String[] args)
    {
         int eid;
        String ename;
        double ta,da,gs,hra,bs;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee id");
        System.out.println("Enter the employee name");
        System.out.println("Enter the employee base salary");
        eid=sc.nextInt();
        ename=sc.next();
        bs=sc.nextDouble();
        Manager1 m=new Manager1(eid,ename,bs);
        m.cal_sal();
       
        m.display();
         m.show();
        
    }
}