import java.io.FileInputStream;
import java.io.FileNotFoundException;

//RumtimeException을 상속 받지 않은 Exception은 Checked Exception이라고 하는데 이들은 예외처리를 해주어야 컴파일이 된다.

public class Exception02 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("Exception02.java");
        }catch(FileNotFoundException f1){
            System.out.println("파일을 찾을 수 없음.");
        }

    }
}
