import java.util.Scanner;

public class NF_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s = sc.nextLine();
        
        try{
            int num = Integer.parseInt(s);
            System.out.println(num+10);
        }
        catch(NumberFormatException e){
            System.out.println("please provide the proper Format :  ");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
