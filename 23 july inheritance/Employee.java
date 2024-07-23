import java.util.Scanner;
    class Emp{
        int eid;
        double bs;
        String ename;
        Emp(int eid , String ename , double bs)
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
class Manager extends Emp
{
    double ta,da,gs,hra;
    Manager(int eid,String ename,double bs)
    {
        super(eid,ename,bs);
        
    }
    double  cal_sal()
    {
        hra=bs*0.50;
        ta=getsalary()*0.40;
        da=getsalary()*0.30;
        gs=getsalary()+hra+ta+da;
        return gs;
    }
    void show()
    {
        System.out.println("Total gross salary is " + cal_sal());
     
    }
        
}
public class Employee
{
    public static void main(String[] args)
    {
         int eid;
        String ename;
        double ta,da,gs,hra,bs;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee id,employee name,base salary");
        eid=sc.nextInt();
        ename=sc.next();
        bs=sc.nextDouble();
        Manager m=new Manager(eid,ename,bs);
        m.cal_sal();
        m.show();
        m.display();
}
}