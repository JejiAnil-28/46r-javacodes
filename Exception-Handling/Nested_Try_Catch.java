import java.util.Scanner;

public class Nested_Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int  n = sc.nextInt();
        String s = "Anil";
        try{
            System.out.println(n/1);
            try{
                System.out.println(Integer.parseInt(s));
                try{
                    System.out.println(s.charAt(2));
                }
                catch(StringIndexOutOfBoundsException e){
                    e.printStackTrace();
                }
            }
            catch(NumberFormatException e){
                e.printStackTrace();
            }    
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }  
    }
        
}
