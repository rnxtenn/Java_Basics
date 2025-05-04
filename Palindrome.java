package Java_Basics;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        int value,rev= 0;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        value = n;
        while(n>0){
            int r = n%10;
            rev = rev*10+r;
            n= n/10;
        }
        if (rev == value){
            System.out.println("it's a Palindrome ");
        }else{
            System.out.println("it's not a palindrome");
        }
    }
}
