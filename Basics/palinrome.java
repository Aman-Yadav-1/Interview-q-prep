// Explanation:

/* Palindrome program in java:
even after reversing a number we get same result
    like 16461 reversed is 16461
*/

//Code 
package Basics;
import java.util.Scanner;

public class palinrome {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int temp = n;
        int rev = 0,rem;

        while(temp!=0){
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        if(n == 0){
            System.out.println(n + " is palindrome ");
        }
        else{
            System.out.println(n + " is not palindrome");
        }
    }
}
