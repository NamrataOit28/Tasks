// no parameter with return value
import java.util.*;
public class Addition {
public static int add() {
	int a,b,c;
	a=22;
	b=28;
	c=a+b;
	return(c);
}
	public static void main(String[] args) {
		int c=add();
		System.out.println("Addition :"+c);
	}

}
