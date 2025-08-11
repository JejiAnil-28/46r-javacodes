import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Throws_Exception {
    public static void dofile( ) throws IOException{
        FileReader fr = new FileReader("FF_exp.txt");
        int a = fr.read();
    }
    public static void main(String[] args) {
        try{
            dofile();
        }
        catch( IOException e){
            e.printStackTrace();
        }

        
    }
}
