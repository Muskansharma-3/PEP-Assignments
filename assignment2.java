// QUESTION 1. Write a recursive function to calculate the sum of the digits of a given positive integer.

// Input:
// Enter a positive integer: 12345

// Output:
// The sum of the digits of 12345 is 15.

import java.util.Scanner;

public class assignment2 {

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number > 0) {
            int result = sumOfDigits(number);
            System.out.println("The sum of the digits of " + number + " is " + result + ".");
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}



