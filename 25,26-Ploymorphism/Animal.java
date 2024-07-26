import java.util.*;
 class Animals {
	public void eat() {
		System.out.println("Eating...");
	}
}
 class Dog extends Animals{
	public void eat() {
	System.out.println("Eating bread...");	
	}
}
 public class Animal{
	 public static void  main(String args[]) {
		 Animals a=new Dog();
		 a.eat();
	 }
 }