package NaveenPractiseSolution;

/*
A positive number is called armstrong number if it is equal to the sum of cubes of its digits
for example 0, 1, 153, 370, 371, 407 etc. ... Let's try to understand why 153 is an Armstrong number.
 */

public class Armstrong {
    public static void main(String[] args)  {
        int c=0,a,temp;
        int n=153;//It is the number to check Armstrong
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}
