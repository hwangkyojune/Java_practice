import java.io.*;
public class FileInfo {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println();
            System.exit(0);
        }
        File f = new File(args[0]);
        if(f.exists()){
            System.out.println("length:"+f.length());
            System.out.println("canRead:"+f.canRead());
            System.out.println("canWrite:"+f.canWrite());
            System.out.println("getAbsolutePath"+f.getAbsolutePath());
            try{
                System.out.println("getCanionPath"+f.getCanonicalPath());

            }catch(IOException e){
                System.out.println(e);
            }
        }

    }
}
