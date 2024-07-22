// no parameter & with return type
import java.util.*;
public class Pronic {
static String pronic() {
	int i,n,flag=1;
	n=121;
	i=1;
	while(i<n)
	{
		if(i*(i+1)==n) {
			flag=0;
			break;
		}
		i++;
	}
	if(flag==0) {
		return("Pronic Number");
	}
	else
		return("not pronic");
}
	public static void main(String[] args) {
		String s1=pronic();
		System.out.println(s1);

	}

}
