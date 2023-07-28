import javax.imageio.IIOException;
import java.io.*;

public class InputStreamExam {

    public static void main(String[] args) {
        File a = new File("C:\\Users\\황교준\\Desktop\\java_practice\\Java_practice\\dsds");

        try{
            BufferedReader br = new BufferedReader(new FileReader(a));

            String k = br.readLine();
            System.out.println(k);
            int b = br.read();
            char t = (char)b;
            System.out.println(t);
        }catch(IOException k){
            System.exit(0);
        }



    }
}