import java.io.*;

public class HelloIO01 {
    public static void main(String[] args) throws IOException {
        OutputStream o = new FileOutputStream("madeInHelloI001" );
        o.write(1);
        o.write(255);
        o.write(-2);
        o.close();
        InputStream o2 = new FileInputStream("madeInHelloI001");
        int a= o2.read();
        System.out.println(a);
        a= o2.read();
        System.out.println(a);
        a= o2.read();
        System.out.println(a);
        a= o2.read();
        System.out.println(a);
        o2.close();
    }
}
