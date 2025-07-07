import java.util.Scanner;

public class PrimeNumberSkip{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("\nPrime numbers between 1 to %d are \n", n);
        System.out.println("skip the multiples of 3.");
        int c=0;
        for(int i=2;i<=n;i++){
            c=0;
            for(int j=1;j<=i;j++){
                if(i % j == 0){
                    if(i%3 == 0){
                        continue;
                    }
                    c++;
                }
            }
            if(c == 2)
                System.out.println(i);
        }

    }
}