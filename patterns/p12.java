/*
 pattern as
 1
 1 2
 1 2 3
 1 2 3 4
 */

import java.util.Scanner;

public class p12 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j + "\t");
            }

            System.out.println();
        }
    }    
}
