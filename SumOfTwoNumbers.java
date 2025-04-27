package Java_Basics;
import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args){
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int Sum = a+b;
        System.out.println("Sum of a & b: "+Sum);
    }
}
