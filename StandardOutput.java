import java.io.PrintStream;

//오버로딩 연습
public class StandardOutput {
    public void println(int x){
        System.out.println(x);
    }
    public void println(double x){
        System.out.println(x);
    }
    public void println(boolean x){
        System.out.println(x);
    }
    public void println(String x){
        System.out.println(x);
    }
    public static void main(String[] args){
        StandardOutput so = new StandardOutput();
        so.println(1);
        so.println("오버로딩 연습");
        so.println(true);
        so.println(1.0);
    }

}
