/* Main.java
 * CSCI 112 - Summer 2021
 * Last edited Aug. 2, 2021 by M. Lacanilao
 *
 * This program will employ a Recursive Method in order to multiply two integers (a, b)
 * via repeated addition. The program will ask user to for two inputs that represent
 * that will be stored as our two integers, so that the "a" integer will be
 * multiplied by adding to itself as many times as the "b" integer is demands.
 */

package RecursiveMultiplication;

import java.util.Scanner; // import Scanner class

public class Main {

    public static void main(String[] args) {
        // declare integers so that the user may store inputs
        int a;
        int b;

        // instantiate Scanner object
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a whole number: ");
        a = sc.nextInt();
        System.out.println ("Enter another whole number: ");
        b = sc.nextInt();

        System.out.println("The product of your two numbers is: " + multiply (a, b));
    } // end main()

    // Multiplication method that causes value of second integer (b) to determine outcome of algorithm
    public static int multiply(int a, int b) {
        // if b is 0, then the product of a * b will always be 0
        if (b == 0) {
            return 0;
            // if b is 1, then the product of a * b will always be 1
        } else if (b == 1) {
            return a;
            // if either int a or int b is negative (or both):
        } else if (b < 0) {
            return multiply(-a, -b);
            // in all other scenarios, int "a" may add the product of itself and int b - 1 to achieve the
            // desired result
        } else {
            return a + (multiply (a, b-1));
        }
    } // end multiply()
} // end Main

/* NOTE: The if you set the recursive method to multiply(2, b), the maximum value you can reliably set int b to is 15704
 * if you set the method to multiply(a, 2), then the maximum value you can set int a to is 1073741823
 */