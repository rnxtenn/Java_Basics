package Java_Basics;
import java.util.Scanner;

public class NumberToWords {
    public void pw(int n,String ch){
        String[] one={" ","one","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eightteen","Nineteen"};
        String[] ten={" ", " ","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        if (n>19){
            System.out.print(ten[n/10]+" "+one[n%10]);
        }else {
            System.out.print(one[n]);
        }
        if (n>0){
            System.out.print(ch);
        }
    }
    public static void main(String[] args){
        System.out.println("Enter Number Greater that 0 : ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("N : "+ n);
        NumberToWords a = new NumberToWords();
        a.pw((n/1000000000),"Hundred");
        a.pw((n/10000000)%100,"crore");
        a.pw((n/100000)%100,"Lakhs");
        a.pw((n/1000)%100,"Thousand");
        a.pw((n/100)%10,"Hundred");
        a.pw((n%100)," ");
    }
}
