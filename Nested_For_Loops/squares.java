import java.util.Scanner;
public class squares {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.err.println(i+"-"+i*i);
        }
        
    }
    
}
