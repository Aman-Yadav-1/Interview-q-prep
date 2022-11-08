package Basics;
import java.util.Scanner;

public class palindrome_string {
    public static void main(String [] args){
        String og,rev = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A String : ");
        og = scan.nextLine();

        int l = og.length();
        for(int i = l - 1;i >= 0;i--){
            rev = rev + og.charAt(i);
        }

        if(og.equals(rev)){
            System.out.println(og + " is palindrome");
        }
        else{
            System.out.println(og + " is not palindrome");
        }
    }
}
