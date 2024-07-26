// method overriding
import java.util.*;
class Shape{
public  void draw(){  
System.out.println("drawing...");  
    }  
}  
 class Rectangle extends Shape  
{  
public  void draw()  
    {  
Logic(l,b);
System.out.println("drawing rectangle...");  
    }  

}  
 class Circle extends  Shape
{  
public  void draw()  
{ 
	logic(r);
System.out.println("drawing circle...");  
    }  

}  
public class Shapes
{  
    public static void Main()  
    {  
        Shape s;  
        s = new Shape();  
        s.draw();  
        s = new Rectangle();  
        s.draw();  
        s = new Circle();  
        s.draw();  

    }  
}  
