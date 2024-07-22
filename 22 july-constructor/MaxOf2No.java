import java.util.Scanner;
public class MaxOf2No {
    int max;
    public MaxOf2No(int num1, int num2) {
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
    }

    public void displayMax() {
        System.out.println("The maximum of two number : " + max);
    }

    public static void main(String[] args) {
    	MaxOf2No max = new MaxOf2No(10, 20);

        max.displayMax();
    }
}