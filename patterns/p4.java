import java.util.Scanner;

public class p4{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int space = 0;
        int star = n;

        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= space;j++){
                System.out.print("\t");
            }
            for(int j = 1;j<=star;j++){
                System.out.print("*\t");
            }
            space++;
            star--;

            System.out.println();
        }
    }
}