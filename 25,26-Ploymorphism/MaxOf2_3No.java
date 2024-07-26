// method overloading
import java.util.*;
class Maximum
{
int a,b,c,x,y;   
void Max(int x,int y)
{
this.x=x;
this.y=y;
    if(x>y)
    {
System.out.println( x + "Number is max");
    }
    else
    {
System.out.println( y+ " Number is max ");
    }
}
void Max(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;
    if(a>b && a>c)
    {
System.out.println( a + "Number is maximum");
    }
    else if(b>a && b>c)
    {
System.out.println( b + "Number is maximum");
    }
    else
    {
System.out.println( c + "Number is maximum");
    }


 class MaxOf2_3No {
    public static void main(String[] args) {
int a,b,c,x,y;
        Scanner sc=new Scanner(System.in);
       Maximum m =new Maximum();
System.out.println("Enter two numbers ");
    x=sc.nextInt();
    y=sc.nextInt();

m.Max(x,y);
System.out.println("Enter three numbers ");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
m.Max(a,b,c);
    }
}
}
}
