import java.util.Scanner;
public class Vehicle {
	
int v_id;
String v_name;
String color;
double price;
Vehicle(){
	v_id=2804;
	v_name="Thar";
	color="Black";
	price=500;
}
void display()
{
	System.out.println("Vehicle Id :"+v_id);
	System.out.println("VehicleName :"+v_name);
	System.out.println("Vehicle Color:"+color);
	System.out.println("Vehicle Price:"+price);

}

public static class Vehicle_Demo{

	public  static void main(String[] args) {
		Vehicle e1=new Vehicle();
e1.display();

	}
}
}
