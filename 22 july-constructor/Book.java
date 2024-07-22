import java.util.Scanner;
public class Book {
	
int b_id;
String b_name;
String author;
double price;
Book(){
	b_id=1;
	b_name="java programming";
	author="xyz";
	price=500;
}
void display()
{
	System.out.println("Book Id :"+b_id);
	System.out.println("Book Name :"+b_name);
	System.out.println("Book Author:"+author);
	System.out.println("Book Price:"+price);

}

public static class Book_Demo{

	public  static void main(String[] args) {
Book e1=new Book();
e1.display();

	}
}
}
