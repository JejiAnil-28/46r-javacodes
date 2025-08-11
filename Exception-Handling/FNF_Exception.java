import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FNF_Exception {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("FNF_exp.txt",true);
        fw.write(11);
        fw.write("Hello ......");
        try{
            FileReader fr = new FileReader("FF_exp.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!");
            System.out.println("Exception message: " + e.getMessage());
        }
        finally{
            System.out.println("successfully completed ");
        }

    }
}
