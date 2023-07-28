import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class HelloIO04 {
    public static void main(String[] args) throws IOException {
        Reader r = new FileReader("madeInHelloIO03");
//        int a = r.read();
//        System.out.println((char)a);
//        a = r.read();
//        System.out.println((char)a);
//        a = r.read();
//        System.out.println((a));
        int a ;
        while((a = r.read())!=-1){
            System.out.println((char)a);
        }
        r.close();
    }
}
