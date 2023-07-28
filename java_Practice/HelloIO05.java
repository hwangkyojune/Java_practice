import java.io.*;

public class HelloIO05 {
    public static void main(String[] args) throws IOException {
//        PrintWriter p = new PrintWriter(new OutputStreamWriter(new FileOutputStream("madeInHelloIO05")));
        PrintWriter p = new PrintWriter(new FileWriter("madeInHelloIO05"));
        BufferedReader fromKeyboard = new BufferedReader( new InputStreamReader(System.in));


        String fileContent ;
        System.out.println("파일에 입력할 내용 : ");
        while(!(fileContent = fromKeyboard.readLine()).equals("")){
            System.out.println("파일에 입력할 내용 : ");
            p.println(fileContent);
        }

        p.close();
        fromKeyboard.close();

        BufferedReader fileRead = new BufferedReader( new FileReader("madeInHelloIO05"));
        String fileLine = null;
        while((fileLine = fileRead.readLine())!= null){
            System.out.println(fileLine);
        }
        fileRead.close();

    }
}
