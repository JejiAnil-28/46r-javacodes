import java.io.FileReader;
import java.io.IOException;

public class checkedandunchecked {
    public static void dofile( ) throws IOException{
        FileReader fr = new FileReader("FF_exp.txt");
        int a = fr.read();
    }
    public static void main(String[] args) {
        try{
           // System.out.println(10/0);
            dofile();
        }
        catch( IOException | ArithmeticException  e){
            e.printStackTrace();
        }
    }
}
