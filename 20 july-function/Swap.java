// swapping  using third variable
import java.util.*;
public class Swap {
static int[] swap(){
	int m=9,n=5;
	int temp=m;
	m=n;
	n=temp;
	int[]a=new int[2];
	a[0]=m;
	a[1]=n;
	return a;
}
	public static void main(String[] args) {
int[]a=new int[2];
a=swap();
System.out.println("a="+a[0]+"\n b="+a[1]);
	}

}
