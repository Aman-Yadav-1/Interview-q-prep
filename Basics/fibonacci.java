package Basics;
import java.util.Scanner;

public class fibonacci{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a = 0;
        int b = 1;

        for(int i = 0;i <= n;i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

