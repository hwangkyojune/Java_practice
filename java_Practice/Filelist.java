import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class Filelist{
    public static void main(String[] args) throws IOException {
        File f = new File("/tmp");
        printFiles(f);
        System.in.read();

    }

    private static void printFiles(File f) {
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for(int i=0;i<files.length;i++){
                System.out.println(files[i].getName());
            }
        }else{
            System.out.println("Not Directory");
        }
    }

}
