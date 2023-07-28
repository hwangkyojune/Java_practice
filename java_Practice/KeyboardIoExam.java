import java.io.*;

public class KeyboardIoExam {
    public static void main(String[] args) throws Exception {
        //키보드로부터 한줄씩 입력받고, 한줄씩 화면에 출력하시오.
        //키보드 : System.in 화면 : System.out
        //키보드로 입력 받는다는 것은 :char단위 입출력
        //char 단위 입출력 클래스는 Reader,Writer클래스
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String a = in.readLine();
        System.out.println(a);
//
//        System.out.print(a);

//        BufferedReader in = new BufferedReader(new StringReader("ss"));
//        String a = in.readLine();
//        System.out.println(a);


    }
}
class a{
    public static final InputStream in = null;
}
