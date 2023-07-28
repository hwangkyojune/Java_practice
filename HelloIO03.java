import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class HelloIO03 {
    //원래는 main 메소드에서 예외처리를 하는 것은 바람직하지 않음. 연습 삼아 예외 처리 한것.
    public static void main(String[] args) throws IOException {
        Writer w = new FileWriter("madeInHelloIO03");
        w.write("a");
        w.write("가");
        w.write(1);
        w.close();

    }
}
