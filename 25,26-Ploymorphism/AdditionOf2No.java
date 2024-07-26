// method overloading
import java.util.*;
class Addition
{
int a,b,c,x,y,add;   
void Add(int x,int y)
{
this.x=x;
this.y=y;
   add=x+y;
System.out.println("Addition of two numbers " + add);
}
void Add(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;
    add=a+b+c;
System.out.println("Addition of two numbers " + add);
}

 public class AdditionOf2NO {
    public static void main(String[] args) {
int a,b,c,x,y;
        Scanner sc=new Scanner(System.in);
       Addition ad =new Addition();
System.out.println("Enter two numbers ");
    x=sc.nextInt();
    y=sc.nextInt();

ad.Add(x,y);
System.out.println("Enter three numbers ");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
ad.Add(a,b,c);
    }
}
}
