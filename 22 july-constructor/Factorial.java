import java.util.Scanner;
public class Factorial {
    int number;
    int factorial;
    public Factorial(int number) {
        this.number = number;
        this.factorial = calculateFactorial(number);
    }
    private int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public void displayFactorial() {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial(4);

        factorial.displayFactorial();
    }
}