// Program to Find an Armstrong
package Java_Basics;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        int n,arg,rem;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        arg = n;
        int temp = n;
        int power = 0;
        int Sum = 0;
        while(temp>0){
            power++;
            temp=temp/10;
        }
        while(n>0){
            rem = n%10;
            Sum = Sum + (int) Math.pow(rem,power);
            n=n/10;
        }
        if (arg == Sum){
            System.out.println("It's an Armstrong : "+arg);
        }else {
            System.out.println("Its not An Armstrong");
        }


        sc.close();
    }
}
