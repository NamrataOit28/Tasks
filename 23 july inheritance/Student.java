import java.util.*;
class Stud{
    int rn;
    String name;
    public Stud(int rn,String name){
        this.rn=rn;
        this.name=name;
    }
    void show(){
        System.out.println("roll number :"+rn);
        System.out.println("Name :"+name);
    }
}
class Xstud extends Stud{
    String cname;
    int salary;
    Xstud(int rn,String name,String cname,int salary){
        super(rn,name);
        this.cname=cname;
        this.salary=salary;
    }
    void display(){
        System.out.println("Company name :"+cname);
        System.out.println("Salary is :"+salary);
    }
}
public class Student{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll number :");
        int rn=sc.nextInt();
        System.out.println("Enter name :");
        String name=sc.next();
        System.out.println("Enter company name :");
        String cname=sc.next();
        System.out.println("Enter your salary :");
        int salary=sc.nextInt();
        Xstud x= new Xstud(rn,name,cname,salary);
        x.show();
        x.display();
}
}
