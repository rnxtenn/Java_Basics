package Java_Basics;
// Types of Errors : Syntax Error, Logical Error, Runtime Error
// An Example of Try_Catch Exception Handling
public class Try_Catch {
    public static void main(String[] args){

        // There are Various Exceptions are
        // ArithmeticException, ArrayIndexOutOfBoundsException

        try{
            int[] a={4, 0, 23, 78, 9, 78, 23};
            try{
                int result  = a[4]/a[1];
                System.out.println(result);
            }catch (ArithmeticException e){
                System.out.println(e);
            }
            System.out.println(a[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
