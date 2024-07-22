// no parameter and no return value
import java.util.*;
public class Perfect {
static void perfect() {
	int i,n,flag=0;
	n=28;
	for(i=1;i<=n/2;i++) {
		if(n%i==0) {
			System.out.println("Number is perfect");
		}
		else {
			System.out.println("Number is not perfect");
		}
	}
}
	public static void main(String[] args) {
 perfect();
	}

}
