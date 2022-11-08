import java.util.Scanner;

public class multi_table {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scan.nextInt();
        System.out.println("The table for " + n + " is : ");

        for(int i = 1;i <= 10;i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
