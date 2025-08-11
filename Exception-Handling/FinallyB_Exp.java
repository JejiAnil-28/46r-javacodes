import java.util.Scanner;

public class FinallyB_Exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.print("Enter a value: ");
        int b = sc.nextInt();

        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("should not divide with zero ");
        }
        finally{
            System.out.println("Finally Block Executed ....");
        }
    }
}
