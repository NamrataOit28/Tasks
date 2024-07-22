import java.util.Scanner;
public class Palindrome {
    int number;
    boolean isPalindrome;

    public Palindrome(int number) {
        this.number = number;
        this.isPalindrome = checkPalindrome(number);
    }

    private boolean checkPalindrome(int n) {
        int reversed = 0;
        int original = n;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }

    public void displayResult() {
        if (isPalindrome) {
            System.out.println(number + " is palindrome.");
        } else {
            System.out.println(number + " is not palindrome.");
        }
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome(121);

        palindrome.displayResult();
    }
}