import java.util.Scanner;

public class Multiple_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int  n = sc.nextInt();
        String s = "Anil";
        try{
            System.out.println(n/1);
            System.out.println(Integer.parseInt(s));
            System.out.println(s.charAt(2));
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
        catch(StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
