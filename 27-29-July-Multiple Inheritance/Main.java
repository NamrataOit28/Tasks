import java.util.Scanner;
interface IntOperations {
    boolean isPositive();
    boolean isNegative();
    boolean isEven();
    boolean isOdd();
    boolean isPrime();
    int factorial();
    int sumOfDigits();
}

class MyNumber implements IntOperations {
    private int num;

    public MyNumber() {
        this(0);
    }

    public MyNumber(int num) {
        this.num = num;
    }

    public boolean isPositive() {
        return num > 0;
    }

    public boolean isNegative() {
        return num < 0;
    }

    public boolean isEven() {
        return num % 2 == 0;
    }

    public boolean isOdd() {
        return num % 2!= 0;
    }

    public boolean isPrime() {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int factorial() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public int sumOfDigits() {
        int sum = 0;
        while (num!= 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Create an object of MyNumber
        MyNumber myNum = new MyNumber(num);

        // Check if the number is positive
        System.out.println("Is Positive: " + myNum.isPositive());

        // Check if the number is even
        System.out.println("Is Even: " + myNum.isEven());

        // Check if the number is prime
        System.out.println("Is Prime: " + myNum.isPrime());

        // Calculate the factorial of the number
        System.out.println("Factorial: " + myNum.factorial());

        // Calculate the sum of digits of the number
        System.out.println("Sum of Digits: " + myNum.sumOfDigits());
    }
}