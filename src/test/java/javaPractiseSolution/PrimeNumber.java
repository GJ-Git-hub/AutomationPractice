package javaPractiseSolution;

import java.util.Scanner;
/*
Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only
. ... For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 */

public class PrimeNumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int temp, num;
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();
        for (int i = 2; i<= num/2; i++) {
            temp = num%i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + "number is prime");
        else
            System.out.println(num + "number is not a prime");


    }
}
