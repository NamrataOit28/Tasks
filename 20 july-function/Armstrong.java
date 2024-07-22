// no argument no return type
import java.util.*;
public class Armstrong {
	    public static void main(String[] args) {
	        int num =171;
	        int temp = num;
	        int sum = 0;
	        int digit;

	        while (temp != 0) {
	            digit = temp % 10;
	            sum = sum + digit * digit * digit;
	            temp = temp / 10;
	        }

	        if (sum == num) {
	            System.out.println(num + " is Armstrong number.");
	        } else {
	            System.out.println(num + " is not Armstrong number.");
	        }
	    }
	}

