//no parameter and with return type
import java.util.*;
public class Pattern {
	static int[] pattern()
	{
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				a[j]=1;
			}
		}
		return a;
	}
	
}
