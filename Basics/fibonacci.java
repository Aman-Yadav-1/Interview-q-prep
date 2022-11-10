/*fibonacci number : start with 0 and every successor is sum of previous two numbers
0 1 1 2 3 5 8 13 21 34
*/

package Basics;
import java.util.Scanner;

public class fibonacci{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        
        for(int i = 1;i <= n;i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}