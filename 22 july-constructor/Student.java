import java.util.Scanner;
public class Student {
	
int s_id;
String s_name;
String address;
double per;
Student(){
	s_id=2804;
	s_name="Thar";
	address="pimple gurav,pune";
	per=90;
}
void display()
{
	System.out.println("Student Id :"+s_id);
	System.out.println("Student Name :"+s_name);
	System.out.println("Student Address:"+address);
	System.out.println("Student Percentage:"+per);

}

public static class Student_Demo{

	public  static void main(String[] args) {
		Student e1=new Student();
e1.display();

	}
}
}
