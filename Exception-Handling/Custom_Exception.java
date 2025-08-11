import java.util.Scanner;

class Custom_Exception extends RuntimeException{
    public Custom_Exception(String s){
        //System.out.println(s);
        super(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  age: ");
        int age = sc.nextInt();
        if(age<18){
            throw new Custom_Exception("Age should be Greater than 18 years");
        }
        
    }
}