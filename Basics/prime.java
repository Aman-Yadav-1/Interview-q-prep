package Basics;

import java.util.Scanner;

public class prime {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int l = scan.nextInt();
        int h = scan.nextInt();
        for(int n = l;n <= h;n++){
            int count = 0;

            for(int j = 2;j*j <= n;j++){
                if(n%j == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(n);
            }
        }
    }
}
