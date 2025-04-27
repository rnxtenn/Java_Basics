package Java_Basics;
import java.util.Scanner;
public class FindArmstrongNumberBetweenLimit {
    public static void main(String[] args){
        System.out.println("Enter your limit:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i=1;i<=n;i++){
            int count = 0;
            int sum =0;
            int temp = i;
            while(temp>0){
                count++;
                temp=temp/10;
            }
            temp = i;
            while(temp>0){
                int r= temp%10;
                sum += (int)Math.pow(r,count);
                temp = temp/10;
            }
            if (sum == i){
                System.out.println("Armstrong Numbers are:"+i);
            }
        }

        sc.close();
    }
}
